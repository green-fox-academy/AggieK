import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

private static Apple apple;

    @Test
    public void ifApple(){

        String fruit = new String ("apple");
        String expectedResult = "apple";

        String result = apple.getApple();

        assertEquals(expectedResult,result);
    }
}