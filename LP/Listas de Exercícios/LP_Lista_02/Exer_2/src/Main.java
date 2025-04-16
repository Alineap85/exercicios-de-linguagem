import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        result = number *2;
        System.out.println("O quadrado " + number + " é: "+ (number*4));
    }
}