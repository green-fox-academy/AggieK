public class Factorio {

    public static void main(String[] args) {
        int f = 5;
        int fact = Factorio (f);
        System.out.println(fact);
    }

    public static int Factorio (int f){
        int fact = 1;
        int i;
        for (i = 1; i<=f; i++){
            fact=fact*i;
        }
        return fact;

    }
}
