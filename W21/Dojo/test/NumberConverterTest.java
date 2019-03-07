import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberConverterTest {

  private static ConvertedNumber convertedNumber;

  @BeforeClass
  public static void init() {
    convertedNumber = new ConvertedNumber();
  }

  @Test
  public void returnNoEmptyString() {
    int numberToConvert = 1;
    String expectedValue = "one";
    String result = convertedNumber.writeNumbersWithLetters(numberToConvert);
    Assert.assertEquals(expectedValue, result);
  }

  @Test
  public void returnFivefor5() {
    int numberToConvert = 5;
    String expectedValue = "five";
    String result = convertedNumber.writeNumbersWithLetters(numberToConvert);
    Assert.assertEquals(expectedValue, result);
  }

  @Test
  public void returnElevenfor11() {
    int numberToConvert = 11;
    String expectedValue = "eleven";
    String result = convertedNumber.writeNumbersWithLetters(numberToConvert);
    Assert.assertEquals(expectedValue, result);
  }

  @Test
  public void returnEightyFivefor85() {
    int numberToConvert = 85;
    String expectedValue = "eightyfive";
    String result = convertedNumber.writeNumbersWithLetters(numberToConvert);
    Assert.assertEquals(expectedValue, result);
  }

}
