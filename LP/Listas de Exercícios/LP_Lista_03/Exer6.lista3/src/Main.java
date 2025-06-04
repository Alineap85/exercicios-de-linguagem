import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        num = in.nextDouble();

        if(num==5)
            System.out.println("Call operation center");
        else if (num==6)
            System.out.println("Take out money");
        else if (num==7)
            System.out.println("Check saving account");
        else if (num==8)
            System.out.println("Edit profile");
        else if (num==9)
            System.out.println("Finish");
        else
            System.out.println("Error");
    }
}