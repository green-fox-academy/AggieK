public class Mammal extends Animal {

    private int height;
    private int weight;



    public Mammal(String name){
        super(name);
    }

    public void sound() {
    }

    public void hunt(){
    }

    @Override
    public String breed() {
        return (" pushing miniature versions out.");
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
