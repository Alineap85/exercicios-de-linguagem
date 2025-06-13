import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, number3, result;

        System.out.println("Digite a velocidade: ");
        System.out.println("Digite a aceleração: ");
        System.out.println("Digite o  tempo de percurso");

        Scanner in = new Scanner(System.in);
        number1 = in.nextInt();
        number2 = in.nextInt();
        number3 = in.nextInt();

        result = number1 *number2 /2;
        System.out.println("Sendo velocidade " + number1 + ", aceleração " + number2 + " e tempo " + number3 + " velocidade final igual a: " + number3 *number2 + number1);

    }
}