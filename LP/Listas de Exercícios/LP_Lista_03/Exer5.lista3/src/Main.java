import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter grade 1: ");
        n1 = in.nextDouble();

        System.out.println("Enter grade 2: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;
        System.out.println("Mean is: " + mean);

        if(mean>=8.5)
            System.out.println("A");
        else if(mean>=7)
            System.out.println("B");
        else if(mean>=5)
            System.out.println("C");
        else
            System.out.println("D");
    }
}