import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base: ");
        number1 = in.nextDouble();

        System.out.println("Digite a altura: ");
        number2 = in.nextDouble();

        result = number1 *number2 /2;
        System.out.println("Sendo base " + number1 + " e altura " + number2 + " área igual a: " + ((number1 *number2)/2));
    }
}