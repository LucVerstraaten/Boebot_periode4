import TI.*;
import communicationLayer.*;

public class RobotMain {

    public static void main(String[] args) {


        while (true) {
            FrameControl.toTheLeft();
            BoeBot.wait(2000000);
        }
        //boolean state = true;


            //state = !state;
           // BoeBot.digitalWrite(0, state);

        //}
    }
}
