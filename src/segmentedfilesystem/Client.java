package segmentedfilesystem;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args){
        int port = 8080;
        InetAddress address = new InetAddress;
        DatagramSocket socket = null;
        DatagramPacket packet;
        byte[] sendBuf = new byte[256];

        if (args.length != 1){
            System.out.println("Usage: java arcana client");
            return;
        }

    }
}
