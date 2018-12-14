
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public static Map<Character, Integer> anagramChecker(String s) {
        Map<Character, Integer> anagramAnalyser = new HashMap<>();
        char[] letters = s.toCharArray();

        for (char letter : letters) {
            if (anagramAnalyser.containsKey(letter)) {
                anagramAnalyser.put(letter, (anagramAnalyser.get(letter) + 1));
            } else anagramAnalyser.put(letter, 1);
        }
        return anagramAnalyser;
    }
}