import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class GetAverage {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        System.out.printf("%.2f", getAverageResult(a, b, c));
    }

    static double getAverageResult(double a, double b, double c){

        double result = (a + b + c) / 3;
        return result;
    }
}
