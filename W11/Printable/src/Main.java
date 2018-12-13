public class Main implements Printable {


    @Override
    public void pintaAllFields() {
        for (Domino d : dominos) {
            d.printAllFields();
        }

        for (Todo t : todos) {
            t.printAllFields();
        }
    }
}
