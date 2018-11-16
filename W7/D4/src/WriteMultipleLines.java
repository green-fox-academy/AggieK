import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
    public static void main(String[] args) {
        appleLines();

    }
    public static void appleLines (){
        try {
            Path filesPath = Paths.get ("src/apple.txt");
            ArrayList <String> lines = (ArrayList<String>) Files.readAllLines(filesPath);
            int numberOfLines = 5;
            String myWord = "apple";
            for (int i = 0; i < numberOfLines; i++) {
                lines.add(myWord);
            }
            for (String line: lines){
                System.out.println(line);
            }
         } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
