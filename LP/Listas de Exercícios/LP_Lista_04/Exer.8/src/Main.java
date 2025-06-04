import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, i, div = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        num = in.nextInt();

        if (num<2)
            System.out.println("Prime number");
        else {
            for (i=1; i<=num; i++) {
                if (num % i == 0);}

            if (div == 2)
                System.out.println("Prime number");
            else
                System.out.println("Not a prime number");
        }

    }
}