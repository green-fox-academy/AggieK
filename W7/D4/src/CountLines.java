import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {
        System.out.println(countLines());
    }

    public static int countLines() {
        try {
            Path filePath = Paths.get("src/my_file.txt");
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filePath);
            int numberOfLines = lines.size();
            return numberOfLines;
        } catch (IOException e) {
            return 0;
        }
    }
}


