import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class RandomizeNumbersFromNToM {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = Math.min(n, m); i <= Math.max(n, m) ; i++) {
            list.add(i);
        }
        Random random = new Random();
        int counter = list.size();
        while (counter > 0){
            int randomNum = random.nextInt(counter);
            System.out.printf("%d ", list.remove(randomNum));
            counter --;
        }
    }
}
