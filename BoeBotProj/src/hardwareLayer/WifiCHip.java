package hardwareLayer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class WifiCHip {
    private static ArrayList<Integer> commands = new ArrayList<Integer>();
    private static Socket socket = null;
    private static ObjectOutputStream oos = null;
    private static ObjectInputStream ois = null;

    public static void ConnectionSetup() throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getByName("192.168.1.185");


        //for(int i=0; i<5;i++){
        //establish socket connection to server
        socket = new Socket(host.getHostName(), 9876);
    }//write to socket using ObjectOutputStream

    //oos = new ObjectOutputStream(socket.getOutputStream());
    //System.out.println("Sending request to Socket Server");
    //oos.writeObject(""+1);
    //read the server response message
    public static ArrayList<Integer> Receive() throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        System.out.println("starting");
        ois = new ObjectInputStream(socket.getInputStream());
        System.out.println("waiting");
        commands = (ArrayList<Integer>) ois.readObject();
        for (int i : commands) {
            System.out.println("Command: " + i);
        }
        //close resources
        ois.close();
        //oos.close();
        return commands;

    }
}
