public class Append_a {
    public static void main(String[] args) {
        String typo = "Chinchill";
        String wholeTypo = appendAFunc(typo);
        System.out.println(wholeTypo);
    }

    public static String appendAFunc(String typo) {
        String wholeTypo = (typo + "a");
        return wholeTypo;
    }
}
