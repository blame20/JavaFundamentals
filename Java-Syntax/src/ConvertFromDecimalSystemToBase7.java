import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class ConvertFromDecimalSystemToBase7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toString(number, 7));
    }
}
