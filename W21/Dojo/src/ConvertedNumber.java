import java.util.ArrayList;

public class ConvertedNumber {

  public String writeNumbersWithLetters(int numberToConvert) {
    String numberConverted = "";
    ArrayList<Integer> numberAsArrayList = makeAnIntArrayFromNumber(numberToConvert);

    return numberConverted;
  }

  public String findNumberTill9(int numberToConvert) {
    String[] numbersInString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    return numbersInString[numberToConvert];
  }

  public String findNumberTill19(int numberToConvert) {
    String[] numbersInString = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    return numbersInString[numberToConvert - 10];
  }

  public String findNumberUpto99(int numberToConvert) {
    String[] numbersInString = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    return numbersInString[numberToConvert - 10];
  }

  public ArrayList<Integer> makeAnIntArrayFromNumber(int number) {
    ArrayList<Integer> numberAsArrayList = new ArrayList<>();

    do {
      numberAsArrayList.add(number % 10);
      number = number / 10;
    } while (number != 0);

    return numberAsArrayList;
  }

  public static void main(String[] args) {
    ConvertedNumber cv = new ConvertedNumber();
    cv.makeAnIntArrayFromNumber(12356789);
  }
}

