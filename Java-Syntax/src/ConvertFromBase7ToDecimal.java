import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class ConvertFromBase7ToDecimal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int base7 = Integer.parseInt(scanner.nextLine(), 7);
        String result = Integer.toString(base7, 10);

        System.out.println(result);
    }
}
