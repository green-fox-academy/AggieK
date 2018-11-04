import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap{
    public static void main(String [] args){
        ArrayList<String> list;
        list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }

    public static String quoteSwap(ArrayList<String> list){
        list.remove(2);
        list.add(2, "cannot");
        list.remove(5);
        list.add(5,"do");

        String quote = "";
        for (String word: list){
            quote +=  word + " " ;
        }
        return quote;
    }

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        // Expected output: "What I cannot create I do not understand."
}