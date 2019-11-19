package communicationLayer;

import TI.BoeBot;
import hardwareLayer.*;

import java.util.Random;

public class SpeakerControl extends Thread {

    public void run(){
        r2d2();
    }

    public void r2d2() {


        Random random = new Random();
        int i =5;
        switch (i/*random.nextInt(6)*/) {

            case 1:Speaker.phase1(); break;
            case 2:Speaker.phase2(); break;
            case 3:Speaker.phase1(); Speaker.phase2(); break;
            case 4:Speaker.phase1(); Speaker.phase2(); Speaker.phase1();break;
            case 5:Speaker.phase1(); Speaker.phase2(); Speaker.phase1(); Speaker.phase2(); Speaker.phase1();
                Speaker.phase1(); Speaker.phase2(); Speaker.phase1(); Speaker.phase2(); Speaker.phase1();break;
            case 6:Speaker.phase2(); Speaker.phase1(); Speaker.phase2(); break;
        }

        Speaker.silence();
        BoeBot.wait(2000);

    }
}
