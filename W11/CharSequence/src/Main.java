public class Main {

    public static void main(String[] args) {

        Gnirts gnirts = new Gnirts("example");

        System.out.println(gnirts.length());
        System.out.println(gnirts.charAt(5));
        System.out.println(gnirts.subSequence(2,5));

        Shifter s = new Shifter("example", 2);

        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.subSequence(3,5));
    }
}
