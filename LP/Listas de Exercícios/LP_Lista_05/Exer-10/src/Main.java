public class Main {
    public static void main(String[] args) {

        int[][] m1 = {{1, 2},
                {2, 1},
                {3, 4}}; //matriz 3x2

        int[][] m2 = {{4, 3},
                {5, 6}}; //matriz 2x2

        int[][] result = new int[3][2];

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                for (int k=0; k<2; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j=0; j<2; j++) {
                System.out.print("\n" + i + ", " + j + " = " + result[i][j] + " ");
            }
        }

    }
}