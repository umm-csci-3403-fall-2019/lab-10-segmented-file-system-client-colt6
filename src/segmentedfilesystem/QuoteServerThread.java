package segmentedfilesystem;


import java.io.*;
import java.net.DatagramSocket;

public class QuoteServerThread implements Runnable{
    public QuoteServerThread() throws IOException {
        this("QuoteServer");
    }

    public QuoteServerThread(String n) throws IOException{
        super(n);
        DatagramSocket socket = new DatagramSocket(6555);
        try {
            BufferedReader in = new BufferedReader(new FileReader("../../test/target-files/small.txt"));
        }
        catch (FileNotFoundException e) {
            System.err.println("Couldn't open the file!");
        }
    }

    @Override
    public void run() {
        
    }
}
