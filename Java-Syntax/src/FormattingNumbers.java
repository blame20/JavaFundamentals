import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class FormattingNumbers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();
        String inHex = Integer.toHexString(a).toUpperCase();
        String inBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", inHex, inBinary, b, c);
    }
}
