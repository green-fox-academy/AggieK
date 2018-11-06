import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {

    public static void main(String[] args) {

        String x = "racecar";
        System.out.println(findPalindrome(x));


    }

    public static boolean checkPalindrome(String word) {
        char[] wordArray = word.toCharArray();
        int count = 0;
        boolean palindrome = false;
        for (int i = 0; i < wordArray.length / 2; i++) {
            if (wordArray[i] == wordArray[wordArray.length - i - 1]) {
                count++;
            }
            if (count == wordArray.length / 2) {
                palindrome = true;
            }
        }
        return palindrome;
    }

    public static ArrayList<String> findPalindrome (String originalWord){
        ArrayList<String> result = new ArrayList<>();
        for (int z = 0; z < originalWord.length()-(z+2); z++) {
            for (int i = 0; i < originalWord.length() - 2; i++) {
                String myString = originalWord.substring(z, i + 3);
                if (checkPalindrome(myString) == true) {
                    result.add(myString);
                }
            }
        }
        return result;
    }
}
