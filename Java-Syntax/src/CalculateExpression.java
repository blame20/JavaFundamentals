import java.util.Scanner;

/**
 * Created by blame on 17.03.2016.
 */
public class CalculateExpression {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double f1 = (a*a + b*b) / (a*a - b*b);
        double f1Pow = (a + b + c) / Math.sqrt(c);
        double f1Result = Math.pow(f1, f1Pow);

        double f2 = (a*a + b*b - c*c*c);
        double f2Pow = a - b;
        double f2Result = Math.pow(f2, f2Pow);

        double avgF1Result = (a + b + c) / 3.0;
        double avgF2Result = (f1Result + f2Result) / 2.0;
        double diff = Math.abs(avgF1Result - avgF2Result);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1Result, f2Result, diff);
    }
}
