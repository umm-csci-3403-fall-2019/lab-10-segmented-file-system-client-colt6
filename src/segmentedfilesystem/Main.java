package segmentedfilesystem;
import java.util.Collections;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

     static DataPackets packets0, packets1, packets2 = new DataPackets();
     static ArrayList<Byte> inputs = new ArrayList<>(3);

    public static void main(String[] args) throws IOException {
        byte[] sendBuf = new byte[0];
        int port = 6014;

        try {
            InetAddress inetaddress = InetAddress.getByName("csci-4409.morris.umn.edu");
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(sendBuf, sendBuf.length, inetaddress, port);
            socket.send(packet);


            while(true){
                byte[] newBuf = new byte[1028];
               // packet = new DatagramPacket(newBuf,)

            }




        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static void packetmatching(byte[] buf) {
        if(inputs.contains(buf[1])) {
            if(inputs.get(0) == buf[1]) {
                if(buf[0] % 2 == 0) {
                    byte[] name = Arrays.copyOfRange(buf, 2, buf.length);
                    packets0.filename = new String(name);
                } else {
                    packets0.add(new DataPackets(buf));
                }
            }
            if(inputs.get(1) == buf[1]) {
                if(buf[0] % 2 == 0) {
                    byte[] name = Arrays.copyOfRange(buf, 2, buf.length);
                    packets1.filename = new String(name);
                } else {
                    packets1.add(new DataPackets(buf));
                }
            }
            if(inputs.get(2) == buf[1]) {
                if(buf[0] % 2 == 0) {
                    byte[] name = Arrays.copyOfRange(buf, 2, buf.length);
                    packets2.filename = new String(name);
                } else {
                    packets2.add(new DataPackets(buf));
                }
            }
        } else {
            inputs.add(buf[1]);
            packetmatching(buf);
        }
    }

}


