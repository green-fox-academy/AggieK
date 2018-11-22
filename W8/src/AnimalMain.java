public class AnimalMain {

    public static void main(String[] args) {
        Animal myAnimal01 = new Animal();
 //       Animal myAnimal02 = new Animal();
 //       Animal myAnimal03 = new Animal (25,42);

        System.out.println("Before: " + myAnimal01);
        myAnimal01.eat();
        myAnimal01.drink();
        System.out.println("After eating & drinking: " + myAnimal01);

        myAnimal01.play();
        System.out.println("After playing: " + myAnimal01);
    }
}
