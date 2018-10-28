public class SumAll {
    public static void main(String[] args) {
        int []ai = {3,4,5,6};
        sumAll (ai);
        System.out.println("Sum of the elements is: " + sumAll(ai));
    }

    public static int sumAll(int[] array) {
        int sum = 0;
        for (int x: array){
            sum += x;
        }
        return sum;
    }
}
