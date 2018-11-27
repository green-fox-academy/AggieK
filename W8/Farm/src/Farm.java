import java.util.ArrayList;

public class Farm {

    private static int maxSlot =10;
    private ArrayList<Animal> animalFarm;

    public Farm(){
        this.animalFarm = new ArrayList<>();
    }

    public ArrayList<Animal> addAnimals(int numberOfAnimals){
        if (numberOfAnimals < maxSlot){
            for (int i = 0; i <numberOfAnimals ; i++) {
                animalFarm.add(new Animal());
            }
        }
        return animalFarm;
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
