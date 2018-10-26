public class greet {
    public static void main(String[] args) {
        String a1 = "Greenfox";
        //String a2 = "Greetings dear, ";
        String greetingLine = greet (a1);
        System.out.println(greetingLine);
    }

    public static String greet(String a1){
        String greetingLine = ("Greetings dear, " + a1);
        return greetingLine;
    }
}
