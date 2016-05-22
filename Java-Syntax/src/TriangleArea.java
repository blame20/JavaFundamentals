import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class TriangleArea {

    public static void  main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int a1 = input.nextInt();
        int b = input.nextInt();
        int b1 = input.nextInt();
        int c = input.nextInt();
        int c1 = input.nextInt();
        int area = (a * (b1 - c1) + b *(c1 - a1) + c * (a1 - b1)) / 2;

        if (area >= 0){
            System.out.println(area);
        }else {
            System.out.println(area * -1);
        }
    }
}
