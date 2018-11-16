import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {

        System.out.println(ticTacResult("src/win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("src/win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("src/draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String filename) {
        List<String> lines = new ArrayList<>();
        char[][] letters = new char[lines.size()][lines.size()];
        try {
            Path filePath = Paths.get(filename);
            lines = Files.readAllLines(filePath);

        } catch (IOException e) {
            System.out.println("there is a probleme wit the file");
        }

        for (int i = 0; i < lines.size(); i++) {
            letters[i] = lines.get(i).toCharArray();
            System.out.println(letters[i]);
        }
        return "proba";
    }
}
