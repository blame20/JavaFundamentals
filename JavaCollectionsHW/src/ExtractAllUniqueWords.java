import java.util.*;

public class ExtractAllUniqueWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String[] textInput = text.split("\\W");
        Arrays.sort(textInput);

        Set<String> uniqueWords = new TreeSet<String>();
        for (int i = 0; i < textInput.length; i++) {
            uniqueWords.add(textInput[i]);
        }
        uniqueWords.stream().forEach(a -> System.out.print(a + " "));
    }
}
