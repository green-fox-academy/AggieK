public class StringB {

    public static void main(String[] args) {
        String myText = "Xylophon, xylophon";
        int n = myText.length();
        System.out.println(replaceXWithY(myText,n));
    }

    public static String replaceXWithY(String myText, int n) {
        if (n == 0){
            return "";
        } else if (myText.charAt(n-1) != ('x')) {
            return replaceXWithY(myText, n-1) + myText.charAt(n-1);
        } else  {
            return replaceXWithY(myText, n-1)+ "y";
        }
    }
}
