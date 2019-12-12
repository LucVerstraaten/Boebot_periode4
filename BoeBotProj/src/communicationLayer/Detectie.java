package communicationLayer;

import TI.BoeBot;

import hardwareLayer.LineFollower;
import hardwareLayer.Sonar;

/**
 * @author Luc Verstraaten
 */

public class Detectie {

    private static LineFollower LineSensors = new LineFollower();
    private static Boolean ldRight;
    private static Boolean ldMiddel;
    private static Boolean ldLeft;
    private static Sonar sonar = new Sonar();
    private static int command;

    public Detectie() {

    }

    /**
     * method for obstacle detection
     *
     * @param distance
     * @return
     */
    public static boolean obstacle(int distance) {
        if (Sonar.pulseEcho() <= distance) {
            return true;
        }
        return false;
    }

    /**
     * method for reading the line sensors
     */
    public static void readLinesensors() {


        LineSensors.setSensorL(BoeBot.analogRead(3));
        LineSensors.setSensorM(BoeBot.analogRead(2));
        LineSensors.setSensorR(BoeBot.analogRead(1));
        ldRight = LineSensors.lineLeft();
        ldMiddel = LineSensors.lineMiddle();
        ldLeft = LineSensors.lineRight();
    }




    public static Boolean getLdMiddel() {
        return ldMiddel;
    }

    public static Boolean getLdLeft() {
        return ldLeft;
    }

    public static Boolean getLdRight() {
        return ldRight;
    }

}
