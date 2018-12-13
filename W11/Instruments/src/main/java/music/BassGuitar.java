package main.java.music;

public class BassGuitar extends StringedInstruments {
    public static final String name = "Bass Guitar";

    public BassGuitar(int nOfStrings) {
        super(name, nOfStrings);
    }

    public BassGuitar(){
        super(name, 4);
    }

    @Override
    public String sound() {
        return ("Duum-duum-duum");
    }

    @Override
    public String play() {
        return null;
    }
}
