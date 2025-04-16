import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite nota 1");
        n1 = in.nextDouble();

        System.out.println("Digite nota 2");
        n2 = in.nextDouble();

        media = (n1+n2)/2;
        System.out.println("A média é " + media);

        if(media>=8.5 )
            System.out.println("A");
        else if(media>=7)
            System.out.println("B");
        else if(media>=5)
            System.out.println("C");
        else
            System.out.println("D");
