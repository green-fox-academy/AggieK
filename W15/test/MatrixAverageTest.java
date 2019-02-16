import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAverageTest {

@Test
  public void testTheOddAverage(){
  int [][] numbers = {{1,2},{5,6}};
  int expectedNumbersResult = 4;
  int resultNumbers = MatrixAverage.calculateTheOddAverage(numbers);
  assertEquals(expectedNumbersResult, resultNumbers);
}


}