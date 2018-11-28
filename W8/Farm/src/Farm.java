import java.util.ArrayList;

public class Farm {

    private static int maxSlot =10;
    private ArrayList<Animal> animalFarm;

    public Farm(){
        this.animalFarm = new ArrayList<>();
    }

    public ArrayList<Animal> addAnimals(){
        if (numberOfAnimals < maxSlot){
            for (int i = 0; i <numberOfAnimals ; i++) {
                animalFarm.add(new Animal());
            }
        }
        return animalFarm;
    }

    public void eat(Animal animal){
        eat();
    }

    public void eat(){
        for (Animal animal: animalFarm)
            eat(animal);
    }

    public void breed(){
        if (getAnimalFarm().size()< maxSlot){
            animalFarm.add(new Animal());
        }
    }

    public void slaughter(){
        Animal leastHungry = animalFarm.get(0);
        for (int i = 0; i > animalFarm.size(); i++){
            if (animalFarm.get(i).getHunger() < leastHungry.getHunger()){
                leastHungry = animalFarm.get(i);
            }
        }
        animalFarm.remove(leastHungry);
    }

    public static int getMaxSlot() {
        return maxSlot;
    }

    public static void setMaxSlot(int maxSlot) {
        Farm.maxSlot = maxSlot;
    }

    public ArrayList<Animal> getAnimalFarm() {
        return animalFarm;
    }

    public void setAnimalFarm(ArrayList<Animal> animalFarm) {
        this.animalFarm = animalFarm;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "animalFarm=" + animalFarm +
                '}';
    }


}
