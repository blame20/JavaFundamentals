import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {

    static String path1 = "resources/lines.txt";
    static String path2 = "resources/words.txt";
    static String path3 = "resources/count-chars.txt";

    static void addZipFile (String path, ZipOutputStream outputZip) throws IOException {

        try (
                FileInputStream input = new FileInputStream(path)
        ) {
            ZipEntry zip = new ZipEntry(path);
            outputZip.putNextEntry(zip);
            byte[] buffer = new byte[4096];
            int byter;
            while ((byter = input.read(buffer, 0, buffer.length)) >= 0) {
                outputZip.write(byter);
            }
        }
    }
    public static void main (String[] args) throws IOException {

        try (
                FileOutputStream output = new FileOutputStream("resources/text-files.zip");
                ZipOutputStream outputZip = new ZipOutputStream(output)
                ) {
            addZipFile(path1, outputZip);
            addZipFile(path2, outputZip);
            addZipFile(path3, outputZip);
        }
    }
}
