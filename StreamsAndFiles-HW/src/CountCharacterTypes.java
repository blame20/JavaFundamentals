import java.io.*;

public class CountCharacterTypes {

    static String VOWELS = "AEIOUaeiou";
    static String CONSONANTS  = "BCDFGHJKLMNPQRSTVWXZYbcdfghjklmnpqrstvwxzy";
    static String PUNCTUATIONS = "!,.?";
    public static void main (String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(
                new FileReader("resources/words.txt"));

        String input;
        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationsCount = 0;

        while ((input = buffer.readLine()) != null) {
            for (int i = 0; i < input.length(); i++) {
                // output += input.charAt(i);
                for (int j = 0; j < VOWELS.length(); j++) {
                    if (input.charAt(i) == VOWELS.charAt(j)) {
                        vowelsCount++;
                    }
                }
                for (int j = 0; j < CONSONANTS.length(); j++) {
                    if (input.charAt(i) == CONSONANTS.charAt(j)) {
                        consonantsCount++;
                    }
                }
                for (int j = 0; j < PUNCTUATIONS.length(); j++) {
                    if (input.charAt(i) == PUNCTUATIONS.charAt(j)) {
                        punctuationsCount++;
                    }
                }

            }
        }
        PrintWriter output = new PrintWriter(
                new FileWriter("resources/count-chars.txt")
        );
        output.write(String.format("Vowels: %d\r\n", vowelsCount));
        output.write(String.format("Consonants: %d\r\n", consonantsCount));
        output.write(String.format("Punctuation: %d", punctuationsCount));

        output.flush();
        output.close();
        buffer.close();
    }
}
