import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] l1 = sc.nextLine().replace(" ", "").toCharArray();
        char[] l2 = sc.nextLine().replace(" ", "").toCharArray();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (Character letters : l1) {
            list1.add(letters);
            list2.add(letters);
        }
        for (Character letters : l2) {
            if (!list2.contains(letters)) {
                list1.add(letters);
            }
        }
        for (Character letters : list1) {
            System.out.print(letters + " ");
        }
    }
}
