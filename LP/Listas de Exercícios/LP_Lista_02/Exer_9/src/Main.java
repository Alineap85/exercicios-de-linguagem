import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextDouble();

        result = number / 1.6;
        System.out.println("O resultado de " + number + " km em milhas é: " + (number/1.6));
    }
}