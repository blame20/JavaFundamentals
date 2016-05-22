import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by blame on 18.03.2016.
 * / Help from other student!!!!!!!!!!!!!!!!!!
 */
public class CharacterMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next("\\w+");
        String str2 = scanner.next("\\w+");

        System.out.println(multiplier(str1, str2));
    }

    static int multiplier (String str1, String str2) {

        int sum = 0;

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length() ; i++) {
                sum += str1.charAt(i) * str2.charAt(i);

            }

        } else if (str1.length() > str2.length()) {

            for (int i = 0; i < str2.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);

            }

            for (int i = str2.length(); i < str1.length() ; i++) {
                sum += str1.charAt(i);

            }
        } else {

            for (int i = 0; i < str1.length() ; i++) {
                sum += str1.charAt(i) * str2.charAt(i);

            }

            for (int i = str1.length(); i < str2.length(); i++) {
                sum += str2.charAt(i);

            }
        }
        return  sum;
    }
}

