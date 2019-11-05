package hardwareLayer;

import TI.*;
/**
 *
 * @author Luc Verstraaten
 */
public class Motor {

    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);
    private static double wait;
    private static int CurrentSpeed;

    /**
     *
     * @param degrees amount of degrees you want to turn
     * @param direction the derection you want to rutn to 1 right 2 left
     */
    public static void turnDegrees(double degrees, int direction)
    {
        s1.update(1500);
        s2.update(1500);
        BoeBot.wait(10);
        CurrentSpeed = 0;
        wait = (degrees/360.0) * 1750;


        if(direction == 1)
        {
            s1.update(1600);
            s2.update(1600);
            CurrentSpeed = 100;
        }
        else if (direction == 2)
        {
            s1.update(1400);
            s2.update(1400);
            CurrentSpeed = 100;
        }
        Timer t1 = new Timer((int)wait);
        t1.mark();
        while(!t1.timeout()){}

        s1.update(1500);
        s2.update(1500);
        CurrentSpeed = 0;

    }

    /**
     * method for slowing dwon while riding forawrds
     */
    public static void slowItDownForwards()
    {
        System.out.println(s1.getPulseWidth());
        if(s1.getPulseWidth() + 200 > 1500)
        {
            int i = 80;
            while (i  <= CurrentSpeed)
            {
                if(CurrentSpeed > 0){
                    i++;
                    s1.update((1500 - CurrentSpeed) + i);
                    s2.update((1500 + CurrentSpeed) - i);
                    BoeBot.wait(50);
                } else {
                    i++;
                }
            }
            CurrentSpeed = 0;
        }
    }


    /**
     * method for slowing down while riding backwards
     */
    public static void slowItDownBackwards()
    {
        if(s1.getPulseWidth() - 200 < 1500)
        {
            int i = 80;
            while (i <= CurrentSpeed)
            {
                if(CurrentSpeed > 0){
                    i++;
                    s1.update((1500 + CurrentSpeed) - i);
                    s2.update((1500 - CurrentSpeed) + i);
                    BoeBot.wait(50);
                } else {
                    i++;
                }
            }
            CurrentSpeed = 0;
        }
    }

    public static void speedItUp()
    {
        int i = 0;
        while (i  <= CurrentSpeed)
        {
            i++;
            s1.update((1300 + CurrentSpeed) - i);
            s2.update((1700 - CurrentSpeed) + i);
            BoeBot.wait(50);
        }
        CurrentSpeed = 200;
    }

    public static void speedInRev() {
        int i = 0;
        while (i  <= CurrentSpeed)
        {
            i++;
            s1.update((1700 - CurrentSpeed) + i);
            s2.update((1300 + CurrentSpeed) - i);
            BoeBot.wait(50);
        }
        CurrentSpeed = 200;
    }

    public static void moveForward()
    {
        if(CurrentSpeed == 200){
            s1.update(1300);
            s2.update(1700);
            CurrentSpeed = 200;
        } else {
            speedItUp();
            CurrentSpeed = 200;
        }
    }

    public static void moveBackward()
    {
        if (CurrentSpeed == 200){
            s1.update(1700);
            s2.update(1300);
            CurrentSpeed = 200;
        } else {
            speedInRev();
            CurrentSpeed = 200;
        }
    }

    /*public static void TurnSeconds(int Direction, int time) {
        // links
        if (Direction == 1) {
            s1.update(1450);
            s2.update(1450);
            CurrentSpeed = 200;
        }

        // rechts
        if (Direction == 2) {
            s1.update(1550);
            s2.update(1550);
            CurrentSpeed = 200;
        }

        //forawrd
        if (Direction == 3) {
            s1.update(1410);
            s2.update(1590);
            CurrentSpeed = 200;
        }

        //backward
        if (Direction == 4) {
            s1.update(1700);
            s2.update(1300);
            CurrentSpeed = 200;
        }
    }*/

    public static void emergencyBrake() {
        s1.update(1500);
        s2.update(1500);
        CurrentSpeed = 0;
    }
}

