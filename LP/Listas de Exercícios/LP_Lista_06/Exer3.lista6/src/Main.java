public class Main {
    public static void main(String[] args) {
        int n;

        scanner in = new scanner(System.in);
        do {
            System.out.println("Digite um numero inteiro maior que zero");
            n = in.nextInt();
        } while (n <= 0);

        System.out.println(n + " ! = " + Fatorial (n));

    }

    Public static int fatorial(int n){

    int fatorial(int n) {
        int fatorial = 1;
        for (int i = n;>1;
        i--){
            fatorial *= i;
        }
        return fatorial
    }
}