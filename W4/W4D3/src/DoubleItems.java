public class DoubleItems {

    public static void main(String[] args) {
        int [] numList = {3, 4, 5, 6, 7};
        doubleIt(numList);
        result(numList);
        }

    public static void doubleIt (int[] array) {
        for (int i = 0; i <array.length ; i++) {
            array[i] *=2;
        }
    }

    public static void result (int[] array) {
        for (int z: array) {
            System.out.print(z + " ");
        }
        System.out.println();
    }
}
