import communicationLayer.*;

public class RobotMain {

    public static void main(String[] args) {

        SpeakerControl speak = new SpeakerControl();
        LedControl led = new LedControl();
        //while (true) {

            speak.start();
            led.speaking();

            FrameControl.achtje();
            //BoeBot.wait(20000);
        //}
        //boolean state = true;


            //state = !state;
           // BoeBot.digitalWrite(0, state);

        //}
    }
}
