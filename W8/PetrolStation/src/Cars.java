public class Cars {

    private String make;
    private String fuelType;
    private int capacity;
    private int fuelInCar;

    public Cars(String make, String fuelType){
        this.make = make;
        this.fuelType = fuelType;
        this.capacity = 100;
        this.fuelInCar = 0;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMake() {
        return make;
    }

    public int getFuelInCar() {
        return fuelInCar;
    }

    public void setFuelInCar(int fuelInCar) {
        this.fuelInCar = fuelInCar;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return make + ", " + fuelType + ", " + capacity + ", " + fuelInCar;
    }
}
