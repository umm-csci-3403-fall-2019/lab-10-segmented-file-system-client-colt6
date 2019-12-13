package segmentedfilesystem;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args){
        int port = 6014;
        InetAddress address = new InetAddress;
        DatagramSocket socket = null;
        byte[] sendBuf = new byte[256];
        DatagramPacket packet = new DatagramPacket(sendBuf,sendBuf.length,);


        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (args.length != 1){
            System.out.println("Usage: java arcana client");
            return;
        }
    }


}
