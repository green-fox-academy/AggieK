public class Bunny {

    public static void main(String[] args) {
        int numberOfBunnies = 11;

        System.out.println(bunnyEars(numberOfBunnies));
    }

    public static int bunnyEars(int n) {
        if (n ==0 ){
            return 0;
        }else{
            return 2 + bunnyEars(n -1);
        }
    }
}
