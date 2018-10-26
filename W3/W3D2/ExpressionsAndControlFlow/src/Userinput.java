import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        // 14 - HelloUser
        System.out.println("Hi, what is your name?");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Hello, " + userInput1 + "!");

        //15 - MileToKmConverter
        System.out.println("What is the distance in kilometers?");
        Scanner distance = new Scanner (System.in);
        int d1 = scanner.nextInt();
        double d2 = (d1*0.621371192);
        int d3 = (int)d2;
        System.out.println("Your distance in miles is: " + d3);


        //16 - AnimalsAndLegs
        System.out.println("How many chickens does the farmer have?");
        Scanner chicken = new Scanner(System.in);
        int chicken1 = scanner.nextInt();
        System.out.println("How many pigs does the farmer have?");
        Scanner pig = new Scanner(System.in);
        int pig1 = scanner.nextInt();
        int legs = ((chicken1*2) + (pig1 * 4));
        System.out.println("The animals have all together " + legs + " legs.");


        //17 - AverageOf Input
        System.out.println("Please choose 5 integers! Numbers shold be between -128 and 127. Please type the numbers and hit an enter between them. ");
        Scanner chooseFiveNumbers = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int sum = (number1 + number2 + number3 + number4 + number5);
        double ave = sum / 5.;
        System.out.println("Sum: " + sum + ", Average: " + ave);





    }
}
