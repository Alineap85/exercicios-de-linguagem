import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 sides for triangle: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a+b>c && a+c>b && b+c>a) {
            System.out.print("It is...");

            if (a==b && b==c)
                System.out.println(" equilateral");

            else if (a==b || a==c || b==c)
                System.out.println(" isosceles");

            else
                System.out.println(" scalene");
        }

        else
            System.out.println("Not possible to draw a triangle");

        in.close();
    }
}