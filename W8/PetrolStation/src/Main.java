public class Main {

    public static void main(String[] args) {

        Station euro95 = new Station ("Euro95", 300);
        Station euro99 = new Station("Euro99", 400);
        Station diesel = new Station("Diesel", 200);

        Cars suzuki = new Cars("Suzuki", "euro95");
        Cars ford = new Cars("Ford", "euro99");
        Cars opel = new Cars("Opel", "diesel");

        System.out.println("We have the following amount of fuel today: " + euro95.toString() + ", " + euro99.toString() + ", " + diesel.toString());
        System.out.println(suzuki.toString());
        euro95.refilled(suzuki);
        System.out.println(suzuki.toString());
        System.out.println(ford.toString());
        euro99.refilled(ford);
        System.out.println(ford.toString());
        System.out.println(opel.toString());
        diesel.refilled(opel);
        System.out.println(opel.toString());
        System.out.println("We have the following amount of fuel today: " + euro95.toString() + ", " + euro99.toString() + ", " + diesel.toString());

    }
}
