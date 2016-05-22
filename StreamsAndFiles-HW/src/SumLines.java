import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SumLines {

    public static void main (String[] args) throws IOException {

        ArrayList<Integer> result = new ArrayList<>();

        try (
                BufferedReader bfr = new BufferedReader(new FileReader
                        ("resources/lines.txt"))) {
            String line;
            while ((line = bfr.readLine()) != null) {

                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                result.add(sum);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
