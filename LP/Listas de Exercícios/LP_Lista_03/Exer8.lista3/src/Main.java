import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your int number: ");
        n1 = in.nextDouble();

        if(n1%2==0)
            System.out.println("Even"); //par
        else
            System.out.println("Odd"); //ímpar
    }
}