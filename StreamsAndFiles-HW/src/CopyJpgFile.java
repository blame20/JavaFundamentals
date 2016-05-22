import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyJpgFile {

    public static void main (String[] args) throws IOException {

        FileInputStream input = new FileInputStream(
                "resources/budeshte-bulgaria.jpg");
        FileOutputStream output = new FileOutputStream(
                "resources/my-copied-picture.jpg");

        FileChannel inputChannel = input.getChannel();
        FileChannel outputChannel = output.getChannel();
        ByteBuffer buffer = ByteBuffer.allocateDirect(1000);

        while (true) {
            int copy = inputChannel.read(buffer);
            if (copy == -1) {
                break;
            }
            buffer.flip();
            outputChannel.write(buffer);
            buffer.clear();
        }
    }
}
