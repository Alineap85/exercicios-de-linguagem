import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int max1 =0, min1 =0;

        Scanner in = new Scanner(System.in);

        for(int i=1; i<=5; i++) {
            System.out.println("Enter " + i + "° number: ");
            int temp = in.nextInt();

            if (i == 1) {
                max1 = temp;
                min1 = temp;
            }

            if (temp > max1)
                max1 = temp;

            if (temp < min1)
                min1 = temp;

        }

        System.out.println("\nMax number: " + max1);
        System.out.println("Min number: " + min1 + "\n");




        int maior2=Integer.MIN_VALUE, menor2=Integer.MAX_VALUE;

        Scanner in2 = new Scanner(System.in);

        for(int i=1; i<=5; i++) {
            System.out.println("Enter " + i + "° number: ");
            int temp = in.nextInt();


            if (temp > maior2)
                maior2 = temp;

            if (temp < menor2)
                menor2 = temp;

        }

        System.out.println("\nMax number: " + maior2);
        System.out.println("Min number: " + menor2);

    }
}