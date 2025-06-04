import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        char option;
        boolean error = false;

        Scanner in = new Scanner(System.in);

        do{
            error = false;
            for (int i=1; i<=10; i++){
                for (int j=0; j<=10; j++){
                    System.out.println(i + " x "+ j + " = ");
                    result = in.nextInt();
                    if (result != (i*j)){
                        error = true;
                        System.out.println("GAME OVER!");
                        break;
                    }
                }
                if (error)
                    break;
                System.out.println("-------------------------");

            }

            if (!error)
                System.out.println("YOU WIN!");
            System.out.println("\nPlay again? \nYes (Y)\nNo (N)");
            option = in.next().charAt(0);

        }while(option == 's' || option=='S');
        System.out.println("TKS 4 PLAYING :)");
    }
}