import java.io.Serializable;

public class Course implements Serializable {
    private String name;
    private int numberOfStudents;

    public Course(String name, int numberOfStudents) {

        this.setName(name);
        this.setNumberOfStudents(numberOfStudents);
    }
    public void setName(String name) {
        if (name == " " || name.chars().anyMatch(ch -> Character.isDigit(ch))) {
            throw new IllegalArgumentException("Incorrect");
        }
        this.name = name;
    }
    public void setNumberOfStudents (int numberOfStudents) {
        if (numberOfStudents < 0) {
            throw new IllegalArgumentException("Incorrect");
        }
        this.numberOfStudents = numberOfStudents;
    }
    public String toString() {
        return String.format("Name: %s, Number of students: %d", this.name, this.numberOfStudents);
    }

}
