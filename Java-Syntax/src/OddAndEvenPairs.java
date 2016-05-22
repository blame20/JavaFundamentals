import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class OddAndEvenPairs {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        if (input.length % 2 != 0){
            System.out.println("Invalid length");
        }else {
            for (int i = 0; i < input.length; i+= 2) {
                int firstNumber = Integer.parseInt(input[i]);
                int secondNumber = Integer.parseInt(input[i + 1]);
                String result = "different";
                if (firstNumber % 2 == 0 && secondNumber % 2 == 0){
                    result = "both are even";
                }else if (firstNumber % 2 !=0 && secondNumber % 2 !=0){
                    result = "both are odd";
                }
                System.out.printf("%d, %d -> %s", firstNumber, secondNumber, result);
                System.out.println();
            }
        }
    }
}
