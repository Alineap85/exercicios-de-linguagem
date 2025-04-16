import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextDouble();

        result = number *2;
        System.out.println("A quinta parte de " + number + " é: "+ (number*5));
    }
}