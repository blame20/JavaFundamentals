import java.io.*;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.join;

public class SaveCustomObjectInFile {

    public static void main (String[] args) throws IOException, ClassNotFoundException {

        List<Course> courses = Arrays.asList(
                new Course("Programming Basics C#", 54),
                new Course("Java Basics", 44),
                new Course("Teamwork and Personal skills", 25)
        );
        try (
                ObjectOutputStream output = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("resources/course.save")))
                ) {
            output.writeObject(courses);
        }
        try (
                ObjectInputStream input = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("resources/course.save")))
                ) {
            String inputRead = input.readObject().toString();
            System.out.println(inputRead);
        }
    }
}
