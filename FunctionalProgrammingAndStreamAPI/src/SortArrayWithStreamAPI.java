import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String position = sc.nextLine();

        if (position.equals("Ascending")) {
            Arrays.stream(input).sorted().forEach(s -> System.out.print(s + " "));
        } else {
            if (position.equals("Descending")) {
                Arrays.stream(input).sorted((x1, x2) -> x2.compareTo(x1)).forEach(s -> System.out.print(s + " "));
            }
        }
    }
}
