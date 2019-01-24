import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequent {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5, 5, 5, 2, 3, 3, 5, 4, 8, 9};

    getTheMostFrequent(createAHashMap(numbers));
  }

  public static HashMap<Integer, Integer> createAHashMap(int[] numbers) {
    HashMap<Integer, Integer> frequencyByNumber = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (frequencyByNumber.containsKey(numbers[i])) {
        frequencyByNumber.put(numbers[i], frequencyByNumber.get(numbers[i]) + 1);
      } else {
        frequencyByNumber.put(numbers[i], 1);
      }
    }
    return frequencyByNumber;
  }

  public static void getTheMostFrequent(HashMap<Integer, Integer> frequencyByNumber) {
    Map.Entry<Integer, Integer> mostFrequentNumber = null;
    Map.Entry<Integer, Integer> secondMostFrequentNumber = null;

    for (Map.Entry<Integer, Integer> item : frequencyByNumber.entrySet()) {
      if (mostFrequentNumber == null) {
        mostFrequentNumber = item;
      } else if (item.getValue() > mostFrequentNumber.getValue()) {
        mostFrequentNumber = item;
      } else if (item.getValue() < mostFrequentNumber.getValue() && secondMostFrequentNumber == null) {
        secondMostFrequentNumber = item;
      } else if
      (item.getValue() < mostFrequentNumber.getValue() && item.getValue() > secondMostFrequentNumber.getValue()) {
        secondMostFrequentNumber = item;
      }
    }
    System.out.println("The most frequent number is : " + mostFrequentNumber.getKey() + " , available in the list " + mostFrequentNumber.getValue() + " times.");
    System.out.println("The second most frequent number is : " + secondMostFrequentNumber.getKey() + " , available in the list " + secondMostFrequentNumber.getValue() + " times.");
  }
}
