package main.java.music;

public class Violin extends StringedInstruments {
    public static final String name = "main.java.music.Violin";

    public Violin (String name, int numberOfStrings){
        super(name, 4);
    }

    public Violin (){
        super(name,4);
    }

    @Override
    public String sound() {
        return ("Screech");
    }

    @Override
    public String play() {
        return null;
    }
}
