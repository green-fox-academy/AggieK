import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Pls give me an integer and we will divide 10 with it.");
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();

        try {
            int result = 10 / divider;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("We can't divide by zero!");
        }
    }
}
