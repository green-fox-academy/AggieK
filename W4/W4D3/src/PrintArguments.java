public class PrintArguments {

    public static void main(String[] args) {
        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third");
        printParams("first", "second", "third", "fourh");
    }

    public static void printParams (String...strings){
        for (String item: strings) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }
}
