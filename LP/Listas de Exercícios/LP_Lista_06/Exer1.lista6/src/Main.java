import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            n = in.nextLong();

        } while (n<=0);
        System.out.println("Sum is: " + sumNumbers(n));
    }


    public static long sumNumbers (long n) {
        long sum = 0;

        for (long i=n; i>0; i--) {
            sum += i;
        }
        return sum;
    }

}