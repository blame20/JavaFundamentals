import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by blame on 16.03.2016.
 */
public class GhettoNumeralSystem {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        String ghettoNumbers = "";
        for (int i = 0; i < n.length() ; i++) {

            switch (n.charAt(i)){

                case '0':
                    ghettoNumbers += "Gee";
                break;
                case '1':
                    ghettoNumbers += "Bro";
                    break;
                case '2':
                    ghettoNumbers += "Zuz";
                    break;
                case '3':
                    ghettoNumbers += "Ma";
                    break;
                case '4':
                    ghettoNumbers += "Duh";
                    break;
                case '5':
                    ghettoNumbers += "Yo";
                    break;
                case '6':
                    ghettoNumbers += "Dis";
                    break;
                case '7':
                    ghettoNumbers += "Hood";
                    break;
                case '8':
                    ghettoNumbers += "Jam";
                    break;
                case '9':
                    ghettoNumbers += "Mack";
                    break;
            }
        }
        System.out.println(ghettoNumbers);
    }
}
