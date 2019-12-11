import TI.BoeBot;
import communicationLayer.*;
import org.omg.PortableServer.POAManagerPackage.State;

public class RobotMain {

    public static void main(String[] args) {

       // while(true)
        //{break;}

        SpeakerControl speak = new SpeakerControl();
        LedControl led = new LedControl();
        speak.start();
        led.speaking();
        while (speak.getState() == Thread.State.WAITING) {
            BoeBot.wait(1);
        }
        BoeBot.wait(2000);
        while (true) {


            FrameControl.achtje();
            BoeBot.wait(2000);


        }
        //boolean state = true;


            //state = !state;
           // BoeBot.digitalWrite(0, state);

        //}
    }
}
