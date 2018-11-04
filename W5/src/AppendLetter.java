import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA((ArrayList) far));
    }

    public static ArrayList appendA (ArrayList u){
        for (int i = 0; i < u.size() ; i++) {
            u.add("a");
        }
        return u;
    }


}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
