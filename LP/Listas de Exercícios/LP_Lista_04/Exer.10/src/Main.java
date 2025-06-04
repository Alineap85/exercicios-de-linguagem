import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();

        int first =0, second =1;

        System.out.print(first + " " + second + " ");

        for(int i=2; i<num; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        System.out.println(); //pular uma linha no final
    }
}