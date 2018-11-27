public class SharpieMain {

    public static void main(String[] args) {

        Sharpie mySharpie01 = new Sharpie("pink", 0.5f, 10.2f);
        Sharpie mySharpie02 = new Sharpie("green", 0.8f, 8.95f);
        Sharpie mySharpie03 = new Sharpie("blue", 0.2f, 0.002f);

        SharpieSet collectionOfSharpies = new SharpieSet();
        collectionOfSharpies.add(mySharpie01);
        collectionOfSharpies.add(mySharpie02);
        collectionOfSharpies.add(mySharpie03);

        System.out.println("We have " + collectionOfSharpies.countUsable() + " sharpies in our set");
        collectionOfSharpies.display();
        System.out.println();
        mySharpie01.use();
        mySharpie02.use();
        mySharpie03.use();
        System.out.println("Now we have " + collectionOfSharpies.countUsable() + " sharpies in our set");
        collectionOfSharpies.removeTrash();
        collectionOfSharpies.display();
    }
}