import java.sql.SQLOutput;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Please type in an integer and it will be divided by 10!");
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();

        try {
            int result = numerator / 10;
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("Can't divide zero!");
        }
    }
}
