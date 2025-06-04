import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, total;
        int parcela, option;

        Scanner in = new Scanner(System.in);

        System.out.println("How many reais: ");
        value = in.nextDouble();

        System.out.println("------------------------------\n" +
                "Menu:\n" +
                "    1. Debit\n" +
                "    2. Pix\n" +
                "    3. Credit\n" +
                "------------------------------\n");
        System.out.println("Choose your option: ");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("DEBIT");
                System.out.println("Your discount is " + value*0.05 + " reais");
                System.out.println("New value is " + value*0.95 + " reais");
                break;

            case 2:
                System.out.println("PIX");
                System.out.println("Your discount is " + value*0.1 + " reais");
                System.out.println("New value is " + value*0.9 + " reais");
                break;

            case 3:
                System.out.println("CREDIT\n");

                System.out.println("How many installment?"); //quantas parcelas?
                parcela = in.nextInt();

                if (parcela >= 1 && parcela <= 4) {
                    System.out.println("Your discount is " + value*0.02 + " reais");
                    System.out.println("New value is " + value*0.98 + " reais");

                } else if (parcela >= 5 && parcela <= 10) {
                    System.out.println("Your discount is " + value*0.05 + " reais");
                    System.out.println("New value is " + value*0.95 + " reais");

                } else
                    System.out.println("Not valid");
                break;

            default:
                System.out.println("Not valid");
                break;
        }
    }
}