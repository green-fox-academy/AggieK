import java.util.*;

public class CandyShop{
    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println(sweets(arrayList));
    }

    public static ArrayList sweets (ArrayList<Object> arrayList){
        arrayList.remove(Integer.valueOf(2));
        arrayList.add(1, "Croissant");
        arrayList.remove(false);
        arrayList.add("Ice cream");
        return arrayList;
    }


        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"

}
