import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double km, miles;

        System.out.println("Digite a distancia em km: ");

        Scanner in = new Scanner(System.in);
        km = in.nextDouble();

        miles = km / 1.6;
        System.out.println(km + "km = "+ miles" + miles");
    }
}