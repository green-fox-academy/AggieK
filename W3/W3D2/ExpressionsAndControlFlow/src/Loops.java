import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //23 -  IWontCheatOnTheExams
        int a = 0;
        while (a < 100) {
            System.out.println("I won't cheat on the exam!");
            a++;
        }

        // 24 - PrintEven
        int b = 0;
        while (b < 501) {
            b++;
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }


        //25 - MultiplicationTable
        System.out.println("Which number do would you like to multiply?");
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();
        int c = 1;
        while (c < 11) {
            int d = c * yourNumber;
            System.out.println(c + " * " + yourNumber + " = " + d);
            c++;
        }


        //26 - CountFromTo
        System.out.println("Give me a number!");
        Scanner scanner1 = new Scanner(System.in);
        int scan1 = scanner.nextInt();
        System.out.println(" And another one!");
        Scanner scanner2 = new Scanner(System.in);
        int scan2 = scanner.nextInt();
        if (scan1 >= scan2) {
            System.out.println("The second number should be bigger");
        } else {
            while (scan1 < scan2) {
                System.out.println(scan1);
                scan1++;
            }
        }


        //27 - FizzBuzz
        int z = 1;
        while (z < 101) {
            if (z % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (z % 5 == 0) {
                System.out.println("Buzz");
            } else if (z % 3 == 0) {
                System.out.println("Fizz");
            } else
                System.out.println(z);
            z++;
        }

        //28 - DrawTriangle
        System.out.println("Give me a number!");
        Scanner atfogo = new Scanner(System.in);
        int atfogo1 = scanner.nextInt();

        for (int j = 0; j < atfogo1; j++) {
            for (z = 1; z < atfogo1; z++) {
                if (z <= j)
                    System.out.print("*");
            }
            System.out.println("*");
        }


        //29 - DrawPyramid
        System.out.println("Give me a number!");
        Scanner pyramid = new Scanner(System.in);
        int p = scanner.nextInt();

        for (int i = 1; i <= p; i++) {
            for (int q = i; q < p; q++)
                System.out.print(" ");
            for (int k = 1; k < (i * 2); k++)
                System.out.print("*");
            System.out.print("\n");
        }


        //30 - DrawDiamond
        System.out.println("Give me a number!");
        Scanner diamond = new Scanner(System.in);
        int diamond1 = scanner.nextInt();
        int no = (diamond1 + 1) / 2;

        int count = 1;
        for (int i = 1; i <= 2 * no - 1; i++) {
            for (int j = count; j <= no + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("*");
            }
            if (i < no)
                count++;
            else
                count--;
            System.out.println("");
        }


        //33 - GuessTheNumber
        System.out.println("Guess the number! It is between 1 - 100");
        Scanner guessNumber = new Scanner(System.in);
        int guessNumber1 = scanner.nextInt();

        int max = 100;
        int min = 1;
        int range = max - min + 1;

        int myNumber = (int) (Math.random() * range) + min;

        if (myNumber > guessNumber1) {
            System.out.println("The stored number is higher");
        } else if (myNumber < guessNumber1) {
            System.out.println("The stored number is lower");
        } else {
            System.out.println("You found the number : " + myNumber);
        }

        //34 - ParametricAverage
        System.out.println("How many numbers would you like to enter?");
        Scanner noNumbers = new Scanner(System.in);
        int noNumbers1 = scanner.nextInt();

        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i<= noNumbers1; i++) {
            System.out.println("Please type a number: ");
            sum = sum + console.nextInt();
        }
        System.out.println("Sum: " + sum + ", Average: " + (sum/noNumbers1));

        //35 - Draw a chess table

        int chess = 8;

        for (int i = 1; i<=chess; i++);
        {
            if (i % 2 == 0) System.out.println(" % % % %");
            else System.out.println("% % % %");
        }


    }

}

