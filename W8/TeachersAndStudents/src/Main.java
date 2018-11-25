public class Main {
    public static void main(String[] args) {
        Teachers teacher01 = new Teachers("Mr. Smith", "English");
        Teachers teacher02 = new Teachers("Mr. Green", "Math");
        Students student01 = new Students("Jane");
        Students student02 = new Students("John");

        System.out.println(student01);
        System.out.println(teacher01);
        student01.learn();
        teacher01.teach(student01);
        student01.question(teacher01);
        System.out.println(student01);
        System.out.println(teacher01);
    }
}
