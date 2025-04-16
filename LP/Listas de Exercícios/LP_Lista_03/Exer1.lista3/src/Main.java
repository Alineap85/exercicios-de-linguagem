import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, sqrt;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número real: ");
        n = in.nextDouble();

        if (n>=0) {
            sqrt = Math.sqrt(n);
            System.out.println("A raíz " + n + " é: " + sqrt);
        }else
            System.out.println("Não existe raíz de " + n);
    }
}
    }
}