import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = in.nextInt();

        System.out.println("Enter second number: ");
        int n2 = in.nextInt();

        if(n1<n2) {
            for(int i=n1+1; i<n2; i++)
                System.out.println(i);
        }

        else if(n1>n2) {
            for(int i=n2-1; i<n1; i++)
                System.out.println(i);
        }

        else
            System.out.println("Both the same number");

    }
}