package main.java.music;

public abstract class StringedInstruments extends Instrument{

   protected int numberOfStrings;

    public StringedInstruments(String name, int numberOfStrings) {
       super(name);
       this.numberOfStrings = numberOfStrings;
    }
         public abstract String sound();
}
