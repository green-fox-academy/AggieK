public class CounterJava {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(recursiveN(n));
    }

    public static int recursiveN(int n) {
       if (n == 0 ) {
           return 0;
       }else {
           System.out.println(n);
           return recursiveN(n - 1);
       }
    }
}
