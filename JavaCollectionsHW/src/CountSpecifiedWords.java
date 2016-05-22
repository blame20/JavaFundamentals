import java.util.Scanner;

public class CountSpecifiedWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] words = input.split("\\W+");
        String result = scanner.nextLine().toLowerCase();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (result.equals(words[i])) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
