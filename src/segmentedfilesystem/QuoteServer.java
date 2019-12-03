package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.DatagramSocket;

public class QuoteServer {
    public static void main(String[] args) throws IOException {
        new QuoteServerThread().start();
    }

    public QuoteServerThread() throws IOException {
        this("QuoteServer");
    }
    public QuoteServerThread(String n) throws IOException{
        super(n);
        socket = new DatagramSocket(6555);
        try {
            in = new BufferedReader(new FileReader("../../test/target-files/small.txt"));
        }
        catch (FileNotFoundException e) {
            System.err.println("Couldn't open the file!");
        }
    }
}
