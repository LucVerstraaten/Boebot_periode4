package hardwareLayer;

import TI.BoeBot;

import java.util.Random;

public class Speaker {

    static int speakerPin = 3;
    private static int duration = 1;// a static duarion for the sound


    public static void phase1()
    {
        Random random = new Random();

        int k = random.nextInt(1000) + 1000;
        for (int i = 0; i <= (random.nextInt(1900) + 100); i++) {
            duration = random.nextInt(duration) +1;
            BoeBot.freqOut(speakerPin, k + (-i * 2),duration);
        }

        for (int i = 0; i <= (random.nextInt(900) + 100); i++){
            duration = random.nextInt(duration) +1;
                        BoeBot.freqOut(speakerPin, k + (i * 10), duration);
        }
    }

    public static void phase2()
    {
        Random random = new Random();
        int k = random.nextInt(1000) + 1000;
        for (int i = 0; i <= (random.nextInt(1900) + 100); i++) {
            duration = random.nextInt(duration) +1;
            BoeBot.freqOut(speakerPin, k+(i*2),duration);
        }

        for (int i = 0; i <= (random.nextInt(900) + 100); i++){
            duration = random.nextInt(duration) +1;
            BoeBot.freqOut(speakerPin, k + (-i * 10),duration);
        }
    }

    public static void  silence()
    {
        BoeBot.freqOut(speakerPin,0, 0);
    }
}
