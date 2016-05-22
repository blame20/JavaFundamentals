import java.util.Scanner;

/**
 * Created by blame on 16.03.2016.
 */
public class PrintACharacterTriangle {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        printTriangle(n);
    }
    static void printLineChar(int start, int end){

        char c = 'a';
        for (int i = start; i <= end; i++, c++) {
            System.out.print(c + " ");
        }
        System.out.println("");
    }
    static void printTriangle(int number){

        for (int i = 1; i <= number; i++) {
            printLineChar(1, i);
        }
        for (int i = number - 1; i >= 1 ; i--) {
            printLineChar(1, i);
        }
    }
}
