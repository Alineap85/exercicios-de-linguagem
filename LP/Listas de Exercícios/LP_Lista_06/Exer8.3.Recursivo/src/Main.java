import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = in.nextInt();

        do{
            System.out.println("Enter Y: ");
            y = in.nextInt();
        }
        while (y<0);
        System.out.println(x + "^" + y + " = " + powerNumber(x, y));
    }


    public static int powerNumber (int x, int y) {
        return y==0? 1 : x*powerNumber(x, y-1);

    }
}