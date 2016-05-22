
import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Arrays.stream(input).filter(i -> i.length() > 3)
                .forEach(i -> System.out.printf("%s ", i));
    }
}
