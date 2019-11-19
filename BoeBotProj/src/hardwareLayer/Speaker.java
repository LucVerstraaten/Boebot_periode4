package hardwareLayer;

import TI.BoeBot;

import java.util.Random;

public class Speaker {

    static int speakerPin = 3;
    private static int duration = 2;// a static duarion for the sound


    public static void phase1()
    {
        Random random = new Random();

        int k = random.nextInt(1000) + 1000;
        for (int i = 0; i <= (random.nextInt(1900) + 100); i++) {

            BoeBot.freqOut(speakerPin, k + (-i * 2),random.nextInt(duration));
        }

        for (int i = 0; i <= (random.nextInt(900) + 100); i++){
                        BoeBot.freqOut(speakerPin, k + (i * 10), random.nextInt(duration));
        }
    }

    public static void phase2()
    {
        Random random = new Random();
        int k = random.nextInt(1000) + 1000;
        for (int i = 0; i <= (random.nextInt(1900) + 100); i++) {

            BoeBot.freqOut(speakerPin, k+(i*2), random.nextInt(duration));
        }

        for (int i = 0; i <= (random.nextInt(900) + 100); i++){

            BoeBot.freqOut(speakerPin, k + (-i * 10),random.nextInt(duration));
        }
    }

    public static void  silence()
    {
        BoeBot.freqOut(speakerPin,0, 0);
    }
}
