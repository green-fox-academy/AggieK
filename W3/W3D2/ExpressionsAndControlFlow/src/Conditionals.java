import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        //18 - OddEven
        System.out.println("What is your number (integers accepted only)? ");
        Scanner scanner = new Scanner(System.in);
        int egyszam = scanner.nextInt();
        if (egyszam % 2 == 0){
            System.out.println("This is an even number");
        }
        else {
            System.out.println("This is an odd number");
        }


        //19 - OneTwoALot
        System.out.println("Give me another number (integers accepted only)?");
        Scanner scanner1 = new Scanner(System.in);
        int egyszam2 = scanner.nextInt();
        if (egyszam2 <= 0){
            System.out.println("Sorry, not enough!");
        }
        else if (egyszam == 1){
            System.out.println("One");
        }
        else if (egyszam == 2) {
            System.out.println("Two");
        }
        else{
            System.out.println("This is a lot!");
        }

        //PrintBigger
        System.out.println("Give me 2 numbers and I tell you which is the bigger one! Please hit an enter between the numbers.");
        Scanner szamok = new Scanner(System.in);
        int egyikszam = scanner.nextInt();
        int masikszam = scanner.nextInt();
        int difi = egyikszam - masikszam;
        if (difi ==0){
            System.out.println("You gave me the same numbers!");
        }
        else if (difi > 0) {
            System.out.println("The bigger number is: " + egyikszam);
        }
        else {
            System.out.println("The bigger number is: " + masikszam);
        }

        //PartyIndicator
        System.out.println("Number of the girls that comes to the party:");
        Scanner invited = new Scanner(System.in);
        int girls = scanner.nextInt();
        System.out.println("Number of the boys that comes to the party:");
        Scanner invited2 = new Scanner(System.in);
        int boys = scanner.nextInt();
        if (((boys + girls) >= 20 ) && (girls == boys)){
            System.out.println("The party is excellent!");
        }
        else if (((boys  + girls) >= 20) && (girls != boys)){
            System.out.println("Quite cool party!");
        }
        else if ((boys + girls) < 20){
            System.out.println("Average party....");
        }
        else if (girls == 0){
            System.out.println("Sausage party");
        }

        // 22 - ConditionalVariableMutation
        double a = 24;
        int out = 0;
        int axa = (int)a;
        if (axa % 2 == 0){
            out++;
            System.out.println("Out = " + out);
        }

        int b = 8;
        String out2 = "";
        if ((b > 10 ) && (b < 20)){
            out2 = ("Sweet!");
        }
        else if (b < 10) {
            out2 = ("Less!");
        }
        else {
            out2 = ("More!");
            System.out.println("Out2 = " + out2);
        }

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if ((credits >= 50) && (isBonus == false)){
            c -= 2;
        }
        else if ((credits < 50) && (isBonus == false)){
            c --;
        }
        System.out.println("C= " + c);

        int d = 8;
        int time = 120;
        String out3 = "";
        if ((d%4 == 0) && (time <= 200)){
            out3 =("check");
        }
        else if (time > 200){
            out3 = ("Time out");
        }
        else out3 = ("Run Forest, Run!");
        System.out.println("Out3 = " + out3);



    }
}

