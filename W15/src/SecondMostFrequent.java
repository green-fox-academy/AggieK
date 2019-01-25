import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequent {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5, 5, 5, 2, 3, 3, 5, 4, 8, 9};

    HashMap<Integer, Integer> aHashMap = createAHashMap(numbers);
    Map.Entry theMostFrequent = findTheMostFrequent(aHashMap);
    Map.Entry theSecondMostFrequent = findTheSecondMostFrequent(theMostFrequent, aHashMap);
    System.out.println(theSecondMostFrequent.getKey());
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

  public static Map.Entry findTheMostFrequent(HashMap<Integer, Integer> frequencyByNumber) {
    Map.Entry<Integer, Integer> mostFrequentNumber = null;
    for (Map.Entry<Integer, Integer> item : frequencyByNumber.entrySet())
      if (mostFrequentNumber == null) {
        mostFrequentNumber = item;
      } else if (item.getValue() > mostFrequentNumber.getValue()) {
        mostFrequentNumber = item;
      }
    return mostFrequentNumber;
  }

  public static Map.Entry findTheSecondMostFrequent(Map.Entry<Integer, Integer> mostFrequentNumber, HashMap<Integer, Integer> frequencyByNumber) {
    frequencyByNumber.remove(mostFrequentNumber.getKey());
    return findTheMostFrequent(frequencyByNumber);
  }
}
