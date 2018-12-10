public class Reptile extends Animal{

    private int length;
    private int temperature;

    public Reptile(String name){
        super(name);
    }

    public void hibernate(){
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
