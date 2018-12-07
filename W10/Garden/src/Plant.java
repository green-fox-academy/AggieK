import java.lang.reflect.Type;

public class Plant {

    public Type type;
    public String color;
    public double currentWater = 0.0;
    public boolean needsWatering;
    public double absorbWater;
    public double waterTreshold;

    public enum Type {Flower, Tree}

    public Plant(Type type, String color, double absorbWater, double waterTreshold) {
        this.type = type;
        this.color = color;
        this.absorbWater = absorbWater;
        this.waterTreshold = waterTreshold;
    }

    public boolean ifThirsty() {
        return currentWater < waterTreshold;
    }

    public void wateringPlant(double water) {
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
