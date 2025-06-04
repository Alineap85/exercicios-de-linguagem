import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        n1 = in.nextDouble();

        System.out.println("Enter number 2: ");
        n2 = in.nextDouble();

        System.out.println("Enter number 3: ");
        n3 = in.nextDouble();

        if(n1>n2 && n1>n3)
            System.out.println(n1 + " é o bigger");
        else if(n2>n1 && n2>n3)
            System.out.println(n2 + " é o bigger");
        else if(n3>n1 && n3>n2)
            System.out.println(n3 + " é o bigger");
        else
            System.out.println("There are similar numbers");
    }
}