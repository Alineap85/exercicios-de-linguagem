import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, mean, rec;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        n1 = in.nextDouble();

        System.out.println("Digite nota 2: ");
        n2 = in.nextDouble();

        mean = (n1+n2)/2;
        System.out.println("A média é: " + mean);

        if(mean>=50){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Digite a nota da recuperação: ");
            rec = in.nextDouble();

            mean = (mean + rec)/2;
            System.out.println("A nova média é: " + mean);

            if(mean<50)
                System.out.println("Reprovado");
            else
                System.out.println("Aprovado");
        }

    }
}}