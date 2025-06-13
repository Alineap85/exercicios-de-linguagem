import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            n = in.nextInt();

        } while (n<=0);
        System.out.println("Factorial is: " + factorialNumbers(n));
    }


    public static int factorialNumbers (int n) {
        if(n==1)
            return 1;
        return n*factorialNumbers(n-1);
    }

}