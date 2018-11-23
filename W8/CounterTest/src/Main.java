public class Main {

    public static void main(String[] args) {

        Counter myCounter01 = new Counter();
        Counter myCounter02 = new Counter(2);
        Counter myCounter03 = new Counter(33);

        System.out.println(myCounter01.toString());
        System.out.println(myCounter02.toString());
        System.out.println(myCounter03.toString());

    }
}
