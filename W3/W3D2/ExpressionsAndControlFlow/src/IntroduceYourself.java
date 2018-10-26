import java.util.Scanner;

public class IntroduceYourself {
    public static <integer> void main(String[] args) {
        System.out.println("Agnes Koperveisz");
        System.out.println("18+");
        System.out.println(1.73);

        //05Two Numbers
        System.out.println(13 + 22);
        System.out.println(13 - 22);
        System.out.println(22 * 13);
        System.out.println(22 / 13.);
        System.out.println(22 / 13);
        System.out.println(22 % 13);

        //06CodingHours
        Integer hours = (6 * 5 * 17);
        System.out.println("Number of hours is spent with coding in a semester by an attendee: " + hours);
        double percent = 6. * 5. / 52. * 100;
        System.out.println("Percentage of the coding hours in the semester if the average working hours weekly is 52: " + percent + "%");

        //07FavoriteNumber
        int favoriteNumber = 8;
        System.out.println("My favorite number is: " + favoriteNumber);

        //08SWAP
        int a = 123;
        int b = 526;
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //09BMI
        double massInKg = 81.2;
        double heightInM = 1.78;
        double BMI = massInKg / heightInM * heightInM;
        System.out.println("Your body mass index is: " + BMI);

        //10DefineBasicInfo
        String myName = "Agnes Koperveisz";
        int myAge = 45;
        double myHeight = 1.73;
        boolean married = true;
        boolean single = false;
        System.out.println("My name is " + myName + " I'm " + myAge + " years old and " + myHeight + " meters tall.");


        //11 - VariableMutation
        int a1 = 3;
        System.out.println(a1 += 10);
        int b1 = 100;
        System.out.println(b1 -= 7);
        int c1 = 44;
        System.out.println(c1 *= 2);
        int d = 125;
        System.out.println(d /= 5);
        int e = 8;
        //System.out.println(e *=e);
        System.out.println(Math.pow(e, 2));
        int f1 = 123;
        int f2 = 345;
        if (f1 > f2) {
            System.out.println("f1 bigger than f2");
        } else {
            System.out.println("f2 bigger than f1");
        }

        int g1 = 350;
        int g2 = 200;
        if ((2 * g2) > g1) {
            System.out.println("The double of g2 is bigger than g1");
        } else {
            System.out.println("The double of g2 is smaller thane g1");
        }

        int h = 135798745;
        if ((135798745 % 11) == 0) {
            System.out.println("11 is a divisor of 135798745");
        } else {
            System.out.println("11 is not a divisor of 135798745");
        }

        int i1 = 10;
        int i2 = 3;
        if ((Math.pow(i2, 3)) > i1) {
            if (i1 > (Math.pow(i2, 2))) {
                System.out.println("I1 is higher than i2 squared and smaller than i2 cubed");
            }
        } else {
            System.out.println("I1 is not higher than i2 squared and smaller than i2 cubed");
        }


        int j = 1521;
        if (j % 15 == 0) {
            System.out.println("1521 dividable by 5 and 3");
        } else if (j % 5 == 0) {
            System.out.println("1521 dividable by 5 and not dividable by 3");
        } else if (j % 3 == 0) {
            System.out.println("1521 dividable by 3 and not dividable by 5");
        } else {
            System.out.println("1521 not dividabel by 5 nor 3");
        }

        String k = "Apple";
        System.out.println(k + k + k +k);

        //12 - Cuboid
        double sidea= 5;
        double sideb = 6.8;
        double sidec= 7.2;
        double surface = 2*(a*b+a*c+b*c);
        double volume = (a*b*c);
        System.out.println("Surface area: " + surface);
        System.out.println("Volume = " + volume);


        // 13 - SecondsInADay
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int x = (24 * 60 * 60) - ((currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds);
        System.out.println("Remaining seconds in a day: " + x);
    }
}
