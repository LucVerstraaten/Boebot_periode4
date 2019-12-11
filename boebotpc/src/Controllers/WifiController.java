package Controllers;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class WifiController {
    private static ServerSocket server;
    //socket server port on which it will listen
    private static int port = 9876;
    public static Socket socket = new Socket();

    public static void ConnectionSetup(String args[]) throws IOException, ClassNotFoundException{
        //create the socket server object
        server = new ServerSocket(port);
        //keep listens indefinitely until receives 'exit' call or program terminates
        System.out.println("Waiting for the client request");
        //creating socket and waiting for client connection
        socket = server.accept();

        //close the ServerSocket object

    }
    public static String Receive() throws IOException, ClassNotFoundException
    {
        //read from socket to ObjectInputStream object
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        //convert ObjectInputStream object to String
        String message = (String) ois.readObject();
        System.out.println("Message Received: " + message);
        ois.close();
        return message;
    }

    public static void Send(ArrayList<Integer> commands)throws IOException, ClassNotFoundException
    {
        //create ObjectOutputStream object
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        //write object to Socket
        oos.writeObject(commands);
        oos.close();
    }

    public void CloseSocket()throws IOException, ClassNotFoundException
    {
        socket.close();
    }
    public void CloseServer()throws IOException, ClassNotFoundException
    {
        server.close();
    }


}

