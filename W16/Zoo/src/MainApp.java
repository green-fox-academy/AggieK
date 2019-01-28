import java.util.ArrayList;
import java.util.List;

public class MainApp {

  public static void main(String[] args) {
    Lion simba = new Lion("Simba", 5, "female");
    Monkey bimbo = new Monkey("Bimbo", 2, "male");
    Elephant banana = new Elephant("Banana", 15, "female");

    List<Animal> animalsToFeed = new ArrayList<>();
    animalsToFeed.add(simba);
    animalsToFeed.add(bimbo);

    Workers paul = new Workers("Paul");
    paul.addAnimalsToDailyRoutine(new Lion("Zordon"));
    paul.addAnimalsToDailyRoutine(banana);

    Workers peter = new Workers("Peter", animalsToFeed);

    paul.doDailyRoutine();
  }
}
