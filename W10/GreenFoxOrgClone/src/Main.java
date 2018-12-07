public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 20, "Male", "BME");
        john.introduce();

        try {
            Student johnTheClone = john.clone();
            johnTheClone.introduce();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}