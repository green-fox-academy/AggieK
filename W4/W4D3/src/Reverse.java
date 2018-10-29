import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int [] aj = {3,4,5,6,7};
        System.out.println("Before reverse: " + Arrays.toString(aj));
        reverse (aj);
        System.out.println("After reverse: " + Arrays.toString(aj));
    }

    public static void reverse(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCopy[array.length - 1 - i];
        }
    }
}
