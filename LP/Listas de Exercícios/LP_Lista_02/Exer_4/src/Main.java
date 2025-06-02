import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite N1: ");
        number1 = in.nextDouble();

        System.out.println("Digite N2: ");
        number2 = in.nextDouble();

        result = (number1 + number2) / 2;
        System.out.println("Sendo N1 " + number1 + " e N2 " + number2 + " a média é igual a: " + ((number1+number2) / 2);

    }
}