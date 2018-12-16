public class Animal {

    private int hunger;
    private int thirst;

    public Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }

    public Animal(int hunger, int thirst){
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int eat(){
        hunger--;
        if (hunger<0){
        hunger =0;
    }
        return 0;
    }

    public int  drink(){
        thirst --;
        if (thirst<0){
            thirst =0;
        }
        return 0;
    }

    public int getHunger(){
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void play(){
        hunger++;
        thirst++;
    }

    @Override
    public String toString() {
        return hunger + ", " + thirst;
    }
}
