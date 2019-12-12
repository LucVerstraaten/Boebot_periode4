package communicationLayer;

import TI.BoeBot;
import TI.Timer;

import java.util.Random;

public class LedControl {

    public static void speaking() {
        Random ran = new Random();
        Timer time = new Timer(2000);

        Boolean speak = true;
        while (speak) {
            int r1 = ran.nextInt(255);
            int r2 = ran.nextInt(255);
            int r3 = ran.nextInt(255);
            int g1 = ran.nextInt(255);
            int g2 = ran.nextInt(255);
            int g3 = ran.nextInt(255);
            int b1 = ran.nextInt(255);
            int b2 = ran.nextInt(255);
            int b3 = ran.nextInt(255);
            BoeBot.rgbSet(0, r1, g1, b1);
            BoeBot.rgbSet(1, r2, g2, b2);
            BoeBot.rgbSet(2, r3, g3, b3);
            //BoeBot.rgbSet(3,255,0,0); doesn't work
            //BoeBot.rgbSet(4,255,0,0); doesn't work
            //BoeBot.rgbSet(5,255,0,0); doesn't work
            BoeBot.rgbShow();
            BoeBot.wait(100);
            if (time.timeout()) {
                BoeBot.rgbSet(0, 0, 0, 0);
                BoeBot.rgbSet(1, 0, 0, 0);
                BoeBot.rgbSet(2, 0, 0, 0);
                BoeBot.rgbShow();
                speak = false;
            }
        }
    }

}
