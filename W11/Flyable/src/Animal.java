public abstract class Animal {

    private int age;
    private String name;
    private String sex;
    private int weight;
    private boolean matute;


    public Animal(String name, int age){
        this.name = name;
        this.age =age;
    }

    public Animal(){};

    public Animal(String name) {
        this.name = name;
    }

    public abstract String breed();

    public String getName() {
        return this.name;
    }
}
