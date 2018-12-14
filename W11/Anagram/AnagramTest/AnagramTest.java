import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagramChecker() {
        Anagram anagram = new Anagram();
        String word1 = "god";
        String word2 = "dog";
        boolean result = anagram.ifAnagram(word1, word2);
        assertTrue(result);
    }

   @Test
    public void anagramChecker_withSpace() {
        Anagram anagram = new Anagram();
        String word1 = "rail safety";
        String word2 = "fairy tales";
        boolean result = anagram.ifAnagram(word1, word2);
        assertTrue(result);
    }

    @Test
    public void anagramChecker_empty(){
        Anagram anagram = new Anagram();
        String word1 = "";
        String word2 = "";
        boolean result = anagram.ifAnagram(word1, word2);
        assertTrue(result);
    }

    @Test
    public void anagramChecker_null(){
        Anagram anagram = new Anagram();
        String word1 = null;
        String word2 = null;
        boolean result = anagram.ifAnagram(word1, word2);
        assertFalse(result);
    }
}
