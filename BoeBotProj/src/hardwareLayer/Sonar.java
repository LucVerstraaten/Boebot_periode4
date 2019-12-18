package hardwareLayer;

import TI.BoeBot;

/**
 * @author Luc Verstraaten
 */
public class Sonar {

    public static void Sonar() {

    }

    public static int pulseEcho() {
        int pulse;
        BoeBot.digitalWrite(0, true);
        BoeBot.wait(1);
        BoeBot.digitalWrite(0, false);
        pulse = BoeBot.pulseIn(1, true, 10000);
        BoeBot.wait(50);
        return (pulse /58);
    }
}