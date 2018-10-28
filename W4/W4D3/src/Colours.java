public class Colours {

    public static void main(String[] args) {
        String[][] colours = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"},
        };
        printOut(colours);
    }

    public static void printOut(String[][] array) {
        for (String[] row: array) {
            for (String item: row) {
                System.out.print(item + ", ");
            }
            System.out.println();
        }
    }
}
