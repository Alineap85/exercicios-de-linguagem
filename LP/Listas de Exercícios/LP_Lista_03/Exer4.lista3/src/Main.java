import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, mean, rec;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter grade number 1: ");
        n1 = in.nextDouble();

        System.out.println("Enter grade number 2: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;
        System.out.println("Mean is: " + mean);

        if(mean>=50){
            System.out.println("Approved");
        }
        else{
            System.out.println("Enter recovery grade: ");
            rec = in.nextDouble();

            mean = (mean + rec)/2;
            System.out.println("New mean is: " + mean);

            if(mean<50)
                System.out.println("Not approved");
            else
                System.out.println("Approved");
        }

    }
}