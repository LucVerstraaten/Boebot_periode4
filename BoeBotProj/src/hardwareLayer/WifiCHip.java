package hardwareLayer;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class WifiCHip {
    private static ArrayList<Integer> commands = new ArrayList<Integer>();

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getByName("192.168.1.185");
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        //for(int i=0; i<5;i++){
        //establish socket connection to server
        socket = new Socket(host.getHostName(), 9876);
        //write to socket using ObjectOutputStream
            //oos = new ObjectOutputStream(socket.getOutputStream());
            //System.out.println("Sending request to Socket Server");
            //oos.writeObject(""+1);
        //read the server response message
        while (true){
        ois = new ObjectInputStream(socket.getInputStream());
        commands = (ArrayList<Integer>) ois.readObject();
        for (int i : commands) {
            System.out.println("Command: " + i);
        }
        //close resources
            ois.close();
            //oos.close();
        Thread.sleep(100);
    }
        //}
    }
}
