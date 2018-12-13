import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void SumTest() {
       Sum sum = new Sum();
        int[] numbers = new int[]{1, 2, 3};
        int expectedResult = 6;

        int result = sum.sumNumbers(numbers);

        assertEquals(expectedResult, result);

    }

    @Test
    public void SumTestWithEmpty (){
        Sum sum = new Sum();
        int [] numbers = {};
        int expectedResult = 0;

        int result = sum.sumNumbers(numbers);

        assertEquals(expectedResult, result);
    }

    @Test
    public void SumTestWithNull(){
        Sum sum = new Sum();
        int[] numbers = null;
        int expectedResult = 0;

        int result = sum.sumNumbers(numbers);

        assertEquals(expectedResult, result);
    }

    @Test
    public void SumTestWithOneElement(){
        Sum sum = new Sum();
        int[] numbers = new int []{5};
        int expectedResult = 5;

        int result = sum.sumNumbers(numbers);

        assertEquals(expectedResult, result);
    }

    @Test
    public void SumTestWithMultipleElement(){
        Sum sum = new Sum();
        int[] numbers = new int []{125,321,569};
        int expectedResult = 1015;

        int result = sum.sumNumbers(numbers);

        assertEquals(expectedResult, result);
    }
}