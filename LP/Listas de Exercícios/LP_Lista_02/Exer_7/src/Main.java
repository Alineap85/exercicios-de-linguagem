import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        System.out.println("Digite um núemro: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextDouble();

        result = number / 25.4;
        System.out.println("O resultado de " + number + " milímetros em polegadas é: "+ (number/25.4));
    }
}