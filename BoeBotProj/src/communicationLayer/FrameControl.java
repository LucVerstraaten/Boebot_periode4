package communicationLayer;

import TI.*;
import hardwareLayer.*;

/**
 *
 * @author Luc Verstraaten
 */
public class FrameControl {

    private static Motor mt = new Motor();
    private static int currentSpeed;

    public static void Drive() {
        currentSpeed = 0;
    }



    public static void forward() {
        mt.moveForward();
    }

    public static void backwards() {
        mt.moveBackward();
    }

    public static void toTheRight() {
        mt.turnDegrees(90, 1);
        currentSpeed = 0;
    }

    public static void toTheLeft() {
        mt.turnDegrees(90, 2);
        currentSpeed = 0;
    }

    public static void _45_DegreesToTheLeft() {
        mt.turnDegrees(45, 2);
        currentSpeed = 0;
    }

    public static void _45_DegreesToTheRight() {
        mt.turnDegrees(45, 1);
        currentSpeed = 0;
    }

    public static void _135_DegreesToTheLeft() {
        mt.turnDegrees(135, 1);
        currentSpeed = 0;
    }

    public static void _135_DegreesToTheRight() {
        mt.turnDegrees(135, 1);
        currentSpeed = 0;
    }

    public static void _180_DegreesToTheRight() {
        mt.turnDegrees(180, 1);
        currentSpeed = 0;
    }

    /**
     * method for stopping the boebot
     */
    public static void emergencyBrake() {
        mt.emergencyBrake();
        currentSpeed = 0;
    }

    public static void slowDownF() {
        mt.slowItDownForwards();
    }

    public static void slowDownB() {
        mt.slowItDownBackwards();
    }

    public static void speedUp() {
        mt.speedItUp();
    }

    public static void speedReverse() {
        mt.speedInRev();
    }

    /**
     * a method for testing the code of the harware
     */
    public static void achtje() {
        forwardLong();
        toTheRight();
        forwardShort();
        toTheLeft();
        forwardLong();
        toTheLeft();
        forwardShort();
        toTheLeft();
        forwardLong();
        toTheLeft();
        forwardShort();
        toTheRight();
        forwardLong();
        toTheRight();
        forwardShort();
        emergencyBrake();
    }

    public static void forwardShort() {
        //if (Detectie.obstacle(2)) {
            Timer timer = new Timer(1250);
            timer.mark();
            while (!timer.timeout()) {
                forward();
            }
        //}
    }

    public static void forwardLong() {
        //if (Detectie.obstacle(2)) {
            TI.Timer timer = new Timer(2500);
            timer.mark();
            while (!timer.timeout()) {
                forward();
            }
        //}
    }

}

