public class Bird extends Animal implements Flyable{

    private int weight;
    private boolean flying;

    public Bird(String name){
        super(name);
    }

    public Bird (){

    }

    @Override
    public String breed() {
        return (" laying eggs.");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void fly() {
        System.out.println("Birds fly with wings");
    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }
}
