public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        appendA(animals);
    }

    public static void appendA(String[] array){
        for (int z = 0; z < array.length; z++) {
            array[z] += "a";
            System.out.print(array[z] + ", ");
        }
        System.out.println();
    }
}
