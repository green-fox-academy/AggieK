import java.util.ArrayList;
import java.util.List;

public class Workers {

  private String name;
  List<Animal> animalsToLookAfter;

  public Workers (String name, List<Animal> animalsToLookAfter){
    this.name = name;
    this.animalsToLookAfter = animalsToLookAfter;
  }

  public Workers (String name){
    this.name = name;
    this.animalsToLookAfter = new ArrayList<>();
  }

  public void addAnimalsToDailyRoutine (Animal animal){
    animalsToLookAfter.add(animal);
  }

  public void doDailyRoutine (){
    for (Animal animal:animalsToLookAfter) {
      if (animal.isHungry()){
        animal.eat();
      }
    }
  }
}
