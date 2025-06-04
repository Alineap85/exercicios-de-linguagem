public class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3},
                {2, 3, 1},
                {3, 1, 2}};

        int determinant;

        determinant =    (m[0][0] * m[1][1] * m[2][2])
                + (m[0][1] * m[1][2] * m[2][0])
                + (m[0][2] * m[1][0] * m[2][1])
                - (m[2][0] * m[1][1] * m[0][2])
                - (m[2][1] * m[1][2] * m[0][0])
                - (m[2][2] * m[1][0] * m[0][1]);

        System.out.println("\n" + determinant);
    }
}