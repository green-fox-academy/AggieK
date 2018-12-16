import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// not completed yet, I have a question!
/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        return (Math.max(Math.max(a, b), c));
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        System.out.println(pool);
        if (pool.size() % 2 == 0) {
           double median = (((pool.get(pool.size() / 2)) + (pool.get((pool.size() / 2) - 1))) / 2);
           return median;
           // there is a problem here, not solved yet
            System.out.println((pool.get((pool.size()) / 2)));
            System.out.println((pool.get((pool.size()) / 2) - 1));

        } else {
            double median = pool.get(((pool.size() - 1) / 2));
            return median;
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return teve;
    }
}