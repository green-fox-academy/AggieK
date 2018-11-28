public class Refactorio {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(refactorio(n));
    }

    public static int refactorio(int i) {
        if (i > 1) {
            return i*refactorio(i - 1);
        }
        return 1;
    }
}