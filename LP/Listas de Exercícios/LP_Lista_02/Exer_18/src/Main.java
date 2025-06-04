import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a: ");
        a = in.nextDouble();

        System.out.println("Digite b: ");
        b = in.nextDouble();

        x = -b/a;
        System.out.println("x é igual: " + x);
    }
}