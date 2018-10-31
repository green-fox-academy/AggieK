import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
        public static void main(String... args){
            ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
            ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

            // Write a method that joins the two lists by matching one girl with one boy into a new list
            // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

            System.out.println(makingMatches(girls, boys));
        }

        public static ArrayList<String> makingMatches(ArrayList<String> list1, ArrayList <String>list2){
            ArrayList <String> paired = new ArrayList();
            int minLength = Math.min(list1.size(),list2.size());
            for (int i = 0; i < minLength; i++) {
                paired.add(list1.get(i));
                paired.add(list2.get(i));
            }
            return paired;
        }
}
