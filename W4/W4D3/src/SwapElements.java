public class SwapElements {

    public static void main(String[] args) {
        String [] abc = {"first" + "second" + "third"};
        swap3to1(abc);
    }

    public static void swap3to1(String[] array) {
        String container = array [0];
        array [2] = array [0];
        array [0] = container;
        System.out.print(array + ", ");
        System.out.println();
    }
}


