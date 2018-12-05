import java.lang.reflect.Type;

public class Plant {

    public Type type;
    public String color;
    public int currentWater = 0;
    public boolean needsWatering;
    public double absorbWater;
    public int waterTreshold;

    public enum Type {Flower, Tree}

    public Plant(Type type, String color, double absorbWater, int waterTreshold) {
        this.type = type;
        this.color = color;
        this.absorbWater = absorbWater;
        this.waterTreshold = waterTreshold;
    }

    public boolean ifThirsty() {
        if (currentWater < waterTreshold)
            needsWatering = true;
        return needsWatering;
    }

    public void wateringPlant(int water) {
        currentWater += water * absorbWater;
    }

    @Override
    public String toString() {
        if (ifThirsty() == true) {
            return ("The " + color + " " + type + " needs water");
        } else {
            return ("The " + color + " " + type + " does not need water");
        }
    }
}
