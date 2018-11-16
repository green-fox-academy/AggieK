import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.Files.copy;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copySuccesful());
    }

    public static boolean copySuccesful() {
        boolean b = false;
        try {
            Path filesPath = Paths.get("src/apple.txt");
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filesPath);
            Files.write(Paths.get("src/alma.txt"), lines);
            b = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }
}
