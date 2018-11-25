public class Station {

    private String fuelType;
    private int fuelAmount;

    public Station(String fuelType, int fuelAmount){
        this.fuelType = fuelType;
        this.fuelAmount = fuelAmount;
    }

    public void refilled(Cars make){
        fuelAmount -= (make.getCapacity());
        make.setFuelInCar(100);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    @Override
    public String toString() {
        return fuelType + " : " + fuelAmount ;
    }
}
