import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] numbersInput = new int[input.length];
        int counter = 0;
        int counterLongest = 1;
        int indexCounter = 0;
        for (int i = 0; i < input.length; i++) {
            numbersInput[i] = Integer.parseInt(input[i]);
        }
        System.out.print(numbersInput[0] + " ");
        for (int i = 1; i < numbersInput.length; i++) {
            if (numbersInput[i] > numbersInput[i - 1]) {
                System.out.print(numbersInput[i] + " ");
                counterLongest++;
            } else {
                System.out.println();
                System.out.print(numbersInput[i] + " ");
                counterLongest = 1;
            }
            if (counterLongest > counter) {
                counter = counterLongest;
                indexCounter = i;
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        int result = (indexCounter - (counter - 1));
        if (counter > 1) {
            for (int i = 0; i < counter; i++) {
                System.out.print(numbersInput[result] + " ");
                result++;
            }
        } else {
            System.out.print(numbersInput[0]);
        }
    }
}
