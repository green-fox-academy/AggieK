import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

    public class CountLettersTest {

        @Test
        public void testAnagramChecker(){
            String word1 = "rail safety";
            String word2 = "fairy tales";

            Map<Character,Integer> expectedResult_Word1 = new HashMap<>();
            expectedResult_Word1.put('r', 1);
            expectedResult_Word1.put('a', 2);
            expectedResult_Word1.put('i', 1);
            expectedResult_Word1.put('l', 1);
            expectedResult_Word1.put('s',1);
            expectedResult_Word1.put('f', 1);
            expectedResult_Word1.put('e',1);
            expectedResult_Word1.put('t', 1);
            expectedResult_Word1.put('y',1);
            expectedResult_Word1.put(' ', 1);

            Map<Character, Integer> resultWord1 = CountLetters.anagramChecker(word1);
            assertEquals(expectedResult_Word1, resultWord1);
        }
    }
