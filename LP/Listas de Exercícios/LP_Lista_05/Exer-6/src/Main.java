public class Main {
    public static void main(String[] args) {
        int [] vector = {1, 2, 3, 4, 5};
        int aux;

        System.out.print("\nInverted array = {");

        for (int i = 0; i< vector.length/2; i++) {
            aux = vector[vector.length-1-i];
            vector[vector.length-1-i] = vector[i];
            vector[i] = aux;
        }

        for (int value: vector)
            System.out.print(value + ", ");

        System.out.println("}");
    }
}