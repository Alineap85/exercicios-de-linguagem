import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner in = new Scanner (System.in);
        System .out.println("Digiye dois valores inteiros separados por espaço:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        if(n1>n2)
            System.out.println(n1 + ">" + n2);

    }
}