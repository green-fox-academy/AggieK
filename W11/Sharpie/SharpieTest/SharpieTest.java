import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {


    @Test
    public void testSingleUse(){
        Sharpie test = new Sharpie("pink", 0.5f);
        Float expectedResult =99F;

        test.use();
        Float result =test.getInkAmount();

        assertEquals(expectedResult,result);
    }
    @Test
    public void testMultipleUse() {
        Sharpie test2 = new Sharpie("magenta", 0.8f);
        Float expectedResult = 95F;

        test2.use();
        test2.use();
        test2.use();
        test2.use();
        test2.use();
        Float result = test2.getInkAmount();

        assertEquals(expectedResult,result);
    }
    }