import java.util.Scanner;

/**
 * Created by blame on 16.03.2016.
 */
public class SumNumbersFrom1toN {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.printf("%d", result);
    }
}
