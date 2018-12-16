import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testWithOneDigitNumber(){
        //assigment
        Fibonacci fibonacci = new Fibonacci();
        Integer n = 9;
        Integer expectedResult = 21;

        //act
        Integer resultNumbers = fibonacci.fibonacciCounter(n);

        //assertion
        assertEquals(expectedResult, resultNumbers);
    }
}