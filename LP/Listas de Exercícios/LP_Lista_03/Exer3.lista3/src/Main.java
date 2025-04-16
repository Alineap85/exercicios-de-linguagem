import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        n1 = in.nextInt();

        System.out.println("Digite nota 2: ");
        n2 = in.nextInt();

        mean = (n1+n2)/2;
        System.out.println("A média é: " + mean);

        System.out.println(mean<50?"Reprovado":"Aprovado");
    }
}