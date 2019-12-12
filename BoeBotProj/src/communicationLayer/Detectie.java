package communicationLayer;

import TI.BoeBot;
import hardwareLayer.BluetoothModule;
import hardwareLayer.LineFollower;
import hardwareLayer.Sonar;

/**
 * @author Luc Verstraaten
 */

public class Detectie {

    private static LineFollower LineSensors = new LineFollower();
    private BluetoothModule btModule = new BluetoothModule();
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

    /**
     * method for reading the bloothtooth
     *
     * @return
     */
    public static int ReadBluetooth() {
        command = BluetoothModule.ReadBluetooth();
        if ((command > 0) && (command < 100)) {

        } else {
            command = 0;
        }
        return command;
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
