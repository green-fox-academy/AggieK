public class ElectricGuitar extends StringedInstruments {
    public static final String name = "Electric Guitar";

    public ElectricGuitar(int nOfStrings){
        super(name, nOfStrings);
    }

    public ElectricGuitar() {
        super(name,6);


}

    @Override
    public String sound() {
        return ("Twang");
    }

    @Override
    public String play() {
        return null;
    }
}
