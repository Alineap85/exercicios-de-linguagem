import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        System.out.println("Digite o raio: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextDouble();

        result = (Math.PI*Math.pow(number, number));
        System.out.println("Se raio é igual a " + number + " a área é: " + (Math.PI*(Math.pow(number, number))));
    }
}
