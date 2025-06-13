import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, result;

        System.out.println("Digite o raio: ");
        System.out.println("Digite a altura: ");

        Scanner in = new Scanner(System.in);
        number1 = in.nextInt();
        number2 = in.nextInt();

        result = (1.0 / 3) * Math.PI * Math.pow(number1, 2) * number2;
        System.out.println("Sendo raio " + number1 + " e altura " + number2 + " área igual a: " + (1.0 / 3) * Math.PI * Math.pow(number1, 2) * number2);

    }
}