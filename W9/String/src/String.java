public class String {
    public static void main(String[] args) {

        String myText;
        myText = "alma";
        System.out.println(myText);
        System.out.println(replaceXWithY(myText));
    }

    public static String replaceXWithY(String myText;int i) {
        if (!myText.toString().contains("x")) {
            return myText;
        }else if (myText.toString().contains("x")){
            int i = myText.indexOf("x");
            return myText.charAt(i-1)+"y";
        }
    }
}
