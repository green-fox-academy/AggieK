public class Power {
    public static void main(String[] args) {
        int base = 2;
        int n = 3;
        System.out.println(powerN(base, n));
    }

    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return powerN (base, n-1) * base;
        }
    }
}
