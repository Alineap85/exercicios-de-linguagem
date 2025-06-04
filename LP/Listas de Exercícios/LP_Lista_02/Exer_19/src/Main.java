import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a, b, c separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b, 2)-4*a*c;

        x1 = (-b-Math.sqrt(delta))/(2*a);
        x2 = (-b+Math.sqrt(delta))/(2*a);

        System.out.println("Delta: " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}