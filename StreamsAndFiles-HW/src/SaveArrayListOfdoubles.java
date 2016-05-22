import java.io.*;
import java.util.ArrayList;

public class SaveArrayListOfdoubles {

    public static void main (String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(0, 1.5);
        doubles.add(1, 2.5);
        doubles.add(2, 3.5);
        doubles.add(3, 4.5);
        doubles.add(4, 5.5);
        try (
                ObjectOutputStream output = new ObjectOutputStream(
                        new BufferedOutputStream(
                            new FileOutputStream("resources/doubles.list")))
                ) {
            output.writeObject(doubles);
        }
        try (
                ObjectInputStream input = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("resources/doubles.list")))
        ) {
            String inputRead = input.readObject().toString();
            System.out.println(inputRead);
        }
    }
}
