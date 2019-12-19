import TI.BoeBot;
import communicationLayer.Detectie;
import communicationLayer.FrameControl;
import communicationLayer.SpeakerControl;
import hardwareLayer.Sonar;
import hardwareLayer.WifiCHip;

import java.io.IOException;
import java.util.ArrayList;

public class RobotMain {

    private static ArrayList<Integer> commands;
    private static boolean driving = false;
    static SpeakerControl speak = new SpeakerControl();
    public static void main(String[] args) {

        while (true) {


            BoeBot.wait(50);

            while (!Detectie.obstacle(5))
            {
                try {
                    WifiCHip.ConnectionSetup();
                    commands = WifiCHip.Receive();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("hoi");
            if (commands != null) {
                speak.start();
                while (speak.getState() == Thread.State.WAITING) {
                    BoeBot.wait(1);
                }
                BoeBot.wait(2000);
                for (Integer c : commands) {
                    switch (c) {
                        case 1:
                            driving = true;
                            break;
                        case 2:
                            // om keren
                            FrameControl.toTheRight();
                            driving = true;
                            break;
                        case 3:
                            FrameControl.toTheLeft();
                            driving = true;
                            break;
                        case 4:
                            FrameControl.toTheRight();
                            driving = true;
                            break;
                    }
                    while (driving) {
                        switch (c) {
                            case 1:
                                Detectie.readLinesensors();
                                if ((Detectie.getLdLeft() == false) && (Detectie.getLdRight() == true)) {
                                    FrameControl.TurnSeconds(2, 10);
                                }

                                if ((Detectie.getLdRight() == false) && (Detectie.getLdLeft() == true)) {
                                    FrameControl.TurnSeconds(1, 10);
                                }
                                if ((Detectie.getLdMiddel() == true)) {
                                    FrameControl.TurnSeconds(3, 10);
                                }
                                if (Detectie.getLdRight() && Detectie.getLdLeft() && Detectie.getLdMiddel()) {
                                    BoeBot.wait(1000);
                                    FrameControl.emergencyBrake();
                                    driving = false;
                                }
                                break;
                            case 3:
                                Detectie.readLinesensors();
                                if ((Detectie.getLdMiddel() == true)) {
                                    //BoeBot.wait();
                                    FrameControl.emergencyBrake();
                                    driving = false;
                                }
                                break;
                            case 4:
                                Detectie.readLinesensors();
                                if ((Detectie.getLdMiddel() == true)) {
                                    //BoeBot.wait();
                                    FrameControl.emergencyBrake();
                                    driving = false;
                                }
                                break;
                        }
                    }
                }
                //commands = null;
            }
            BoeBot.wait(100);
        }
        BoeBot.wait(1000);
        }
        /*SpeakerControl speak = new SpeakerControl();
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

        //}*/
    }
}
