import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"



        try {
            Path filePath = Paths.get("src/my_file.txt");
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filePath);
            ArrayList<String> newList = new ArrayList<>();
            newList.add("Agi");
            Files.write(filePath, newList, StandardOpenOption.APPEND);
            lines = (ArrayList<String>) Files.readAllLines(filePath);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}