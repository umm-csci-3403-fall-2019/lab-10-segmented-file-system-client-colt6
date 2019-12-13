package segmentedfilesystem;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {
    
    public static void main(String[] args) throws IOException {
        byte[] sendBuf = new byte[1028];
        int port = 8080;


        try {
            InetAddress inetaddress = InetAddress.getByName("csci-4409.morris.umn.edu");
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(sendBuf, sendBuf.length, inetaddress, port);
            socket.send(packet);

            while(true){

            }



        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}


