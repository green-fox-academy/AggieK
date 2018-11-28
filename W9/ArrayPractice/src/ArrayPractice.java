import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 45, 62, 89, 101, 98);
        System.out.println(chooseEven(numbers));

    }

    public static List<Integer> chooseEven (List<Integer> numbers){
        List<Integer> evenNumber = new ArrayList<>();
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i) % 2 ==0){
                evenNumber.add(numbers.get(i));
            }
        }
        return  evenNumber;
    }
}
