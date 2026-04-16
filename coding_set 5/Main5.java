
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main5 {
    public static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("example.txt");
        System.out.println("File opened successfully");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("file not found" + e.getMessage());
        }
    }
}