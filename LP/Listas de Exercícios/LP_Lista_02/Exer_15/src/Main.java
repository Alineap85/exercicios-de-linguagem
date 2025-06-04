import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, result;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite o raio: ");
        number1 = in.nextDouble();

        System.out.println("Digite a altura: ");
        number2 = in.nextDouble();

        result = Math.PI * Math.pow(number1, 2) * number2;
        System.out.println("Se o raio é " + number1 + " e a altura " + number2 + " o volume é: " + Math.PI * Math.pow(number1, 2) * number2);
    }
}