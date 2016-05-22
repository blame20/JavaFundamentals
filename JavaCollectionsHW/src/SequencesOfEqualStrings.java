import java.util.*;

public class SequencesOfEqualStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");
        int counter = 1;
        int indexCounter = 0;
        int endCounter = 1;

        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i].equals(elements[i + 1])) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > endCounter) {
                endCounter = counter;
                indexCounter = i;
            }
        }
        for (int i = 0; i < endCounter; i++) {
            System.out.print(elements[indexCounter] + " ");
        }
    }
}
