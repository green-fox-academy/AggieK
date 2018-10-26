public class CompareLenght {
    public static void main(String[] args) {
        int [] p1 = {1,2,3};
        int [] p2 = {4,5};

        if (p1.length > p2.length ) {
            System.out.println("p1 has more elements than p2");
        }
        else if (p1.length == p2.length) {
            System.out.println("p1 has the same number of elements as p2");
        }
        else {
            System.out.println("p2 has more elements than p1");
        }

    }
}
