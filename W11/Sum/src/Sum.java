import java.util.ArrayList;

public class Sum {

    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        if (numbers == null) return 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

}
