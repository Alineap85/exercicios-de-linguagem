import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            n = in.nextLong();

        } while (n<=0); //fica repetindo até user digitar um número maior que zero
        System.out.println("Sum is: " + sumNumbers(n));
    }


    public static long sumNumbers (long n) {
        if(n==1)
            return 1;
        return n + sumNumbers(n-1);
    }

}