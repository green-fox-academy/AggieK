public class NumberAdder {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(recursiveAdd(n));
    }

    public static int recursiveAdd(int n){
        if (n == 1){
           return 1;
        } else {
           return n + recursiveAdd(n-1);
        }
    }
}
