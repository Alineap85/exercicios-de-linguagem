import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextDouble();

        result = number / 3.6;
        System.out.println("O resultado de " + number + "km/h é " + (number/3.6) + "m/s");

    }
}