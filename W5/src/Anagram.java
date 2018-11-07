public class Anagram {

    public static void main(String[] args) {

        String x = "god";
        String y = "dog";

        System.out.println(anagram(x,y));

    }

    public static boolean anagram (String x, String y){
        StringBuilder newx = new StringBuilder(x);
        System.out.println(newx);
        StringBuilder newy = new StringBuilder(y);
        System.out.println(newy);
        //System.out.println(newx.reverse());
        if (newx.reverse().toString().equals(y)){

            return true;
        } else return false;
    }

}


