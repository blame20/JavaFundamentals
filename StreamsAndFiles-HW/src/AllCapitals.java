import java.io.*;

public class AllCapitals {

    public static void main (String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(
                new FileReader("resources/lines1.txt"));

        String result = "";
        String input;

        while ((input = bfr.readLine()) != null) {

            result += input.toUpperCase() + "\r\n";
        }

        PrintWriter print = new PrintWriter(
                new FileWriter("resources/lines1.txt")
        );
        print.write(result);
        print.flush();
        print.close();
        bfr.close();
    }
}
