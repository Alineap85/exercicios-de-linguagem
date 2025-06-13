import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println( "---------------" +
                "\nMENU" +
                "\n---------------" +
                "\n1. Sum" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division" +
                "\n---------------" +
                "\n");

        int option = in.nextInt();

        switch (option){
            case 1:
                result = n1+n2;
                System.out.println("Sum is: " + n1 + " + " + n2 + " = " + result);
                break;

            case 2:
                result = n1-n2;
                System.out.println("Subtraction is: " + n1 + " - " + n2 + " = " + result);
                break;

            case 3:
                result = n1*n2;
                System.out.println("Multiplication is: " + n1 + " x " + n2 + " = " + result);
                break;

            case 4:
                result = n1/n2;
                System.out.println("Division is: " + n1 + " / " + n2 + " = " + result);
                break;

            default:
                System.out.println("Not valid");
                break;
        }
    }
}