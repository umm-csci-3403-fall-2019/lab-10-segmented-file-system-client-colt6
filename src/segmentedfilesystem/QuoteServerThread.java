package segmentedfilesystem;


import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class QuoteServerThread implements Runnable{
    DatagramSocket socket;
    public QuoteServerThread() throws IOException {
        this("QuoteServer");
    }

    public QuoteServerThread(String n) throws IOException{
        super(n);
        socket = new DatagramSocket(6555);
        try {
            BufferedReader in = new BufferedReader(new FileReader("../../test/target-files/small.txt"));
        }
        catch (FileNotFoundException e) {
            System.err.println("Couldn't open the file!");
        }
    }

    @Override
    public void run() {
        byte[] bytename = new byte[1028];
        DatagramPacket packet = new DatagramPacket(bytename, bytename.length);
        try {
            socket.receive(packet);
        }
        catch (IOException e){
            System.out.println("There was an IO error.");
        }
    }
}
