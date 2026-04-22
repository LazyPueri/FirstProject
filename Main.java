import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File file = new File("grades.text");
        try {
            Scanner reader = new Scanner(file);
            System.out.println("Student Grades:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
