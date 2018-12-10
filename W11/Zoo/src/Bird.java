public class Bird extends Animal {

    private int weight;
    private boolean flying;

    public Bird(String name){
        super(name);
    }

    @Override
    public String breed() {
        return (" laying eggs.");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
