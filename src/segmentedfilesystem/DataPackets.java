package segmentedfilesystem;
import java.io.File;
import java.util.ArrayList;

public class DataPackets {

    int packetNumber;
    byte[] packet;
    int dataLength;
    String filename;
    boolean isfooter;

    public void DataPacket (byte statusByte, byte fileID,int packetNumber, byte[] packetBuffer){
        this.filename = filename;
        this.packetNumber = packetNumber;
        this.packet = packet;
        this.dataLength = packetBuffer.length;
        this.isfooter = statusByte % 4 == 3;
    }

    public ArrayList<Byte> getBoxedData(){
        ArrayList<Byte> outputBytes = new ArrayList<>();
        for (int i = 0; i < dataLength; i++){
            outputBytes.add( packet[i]);
        }
        return outputBytes;
    }


    @Override
    public void addToFile(File file) {
        file.add(this);
    }
}
