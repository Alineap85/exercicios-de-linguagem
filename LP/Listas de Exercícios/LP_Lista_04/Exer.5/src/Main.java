import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, factorial;
        factorial = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        n = in.nextInt();

        System.out.print(n + "! = ");

        while (n>1) {
            factorial = factorial * n;
            n--;
        }

        System.out.println(factorial);
    }
}