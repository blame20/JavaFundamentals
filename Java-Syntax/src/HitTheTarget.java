import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class HitTheTarget {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int theTarget = scanner.nextInt();

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if (i + j == theTarget) {
                    System.out.printf("%d + %d = %d", i, j, theTarget);
                    System.out.println();
                }else if (i - j == theTarget){
                    System.out.printf("%d - %d = %d", i, j, theTarget);
                    System.out.println();
                }
            }
        }
    }
}
