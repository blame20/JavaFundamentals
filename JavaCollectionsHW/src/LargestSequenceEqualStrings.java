import java.util.ArrayList;
import java.util.Scanner;

public class LargestSequenceEqualStrings {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int counter = 1;
        int largestCounter = 1;
        int indexCounter = 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(input[i - 1])) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > largestCounter) {
                largestCounter = counter;
                indexCounter = i;
            }
        }
        for (int i = 0; i < largestCounter; i++) {
            System.out.println(input[indexCounter] + " ");
        }
    }
}

