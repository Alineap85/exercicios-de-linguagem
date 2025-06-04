import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value1, value2;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("------------------------------\n" +
                "Menu:\n" +
                "    1. Circle\n" +
                "    2. Right Triangle\n" +
                "    3. Rectangle\n" +
                "------------------------------\n");

        System.out.println("Enter your geometric figure: ");
        option = in.nextInt();

        System.out.println("Enter base/radius: ");
        value1 = in.nextDouble();

        System.out.println("Enter height: ");
        value2 = in.nextDouble();

        switch (option) {
            case 1:
                System.out.println("AREA: " + Math.PI*Math.pow(value1, 2));
                System.out.println("PERIMETER: " + 2*Math.PI*value1);
                break;

            case 2:
                double hipotenusa = Math.sqrt(Math.pow(value1, 2) + Math.pow(value2, 2));
                System.out.println("AREA: " + (value1 * value1) / 2);
                System.out.println("PERIMETER: " + value1 + value2 + hipotenusa);
                break;

            case 3:
                System.out.println("AREA: " + value1 * value1);
                System.out.println("PERIMETER: " + value1 + value1 + value2 + value2);
                break;
        }
    }
}