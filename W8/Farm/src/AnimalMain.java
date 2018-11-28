public class AnimalMain {

    public static void main(String[] args) {
        Farm farm = new Farm();
        System.out.println(farm);

        farm.eat();
        System.out.println(farm);

        farm.breed();
        farm.breed();
        farm.breed();
        System.out.println(farm);

        System.out.println(farm.addAnimals());
    }
}
