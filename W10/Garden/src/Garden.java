import java.util.ArrayList;
import java.util.List;

public class Garden {
    public String name;
    public ArrayList<Plant> myGarden;

    public Garden(String name) {
        this.name = name;
        this.myGarden = new ArrayList<>();
    }

    public void addPlantsToMyGarden(Plant plant) {
        myGarden.add(plant);
    }

    public int countThirsty() {
        int counter = 0;
        for (Plant plant : myGarden) {
            if (plant.ifThirsty() == true) {
                counter++;
            }
        }
        return counter;
    }

    public void wateringGarden(double water) {
        for (Plant plant : myGarden) {
            plant.wateringPlant(water / countThirsty());
        }
    }

    @Override
    public String toString() {
        String allGarden = " ";
        for (Plant plant : myGarden) {
            allGarden = allGarden + plant.toString() + "\n";
        }
        return allGarden;
    }
}
