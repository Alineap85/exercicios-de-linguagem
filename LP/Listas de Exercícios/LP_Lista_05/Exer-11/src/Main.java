import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row1, column1, row2, column2;

        Scanner in = new Scanner(System.in);

        System.out.println("Number of ROWS in the FIRST matrix: ");
        row1 = in.nextInt();

        System.out.println("Number of COLUMNS in the FIRST matrix: ");
        column1 = in.nextInt();

        System.out.println("Number of ROWS in the SECOND matrix: ");
        row2 = in.nextInt();

        System.out.println("Number of COLUMNS in the SECOND matrix: ");
        column2 = in.nextInt();


        int[][] m1 = new int [row1][column1];
        int[][] m2 = new int [row2][column2];
        int[][] result = new int [row1][column2];


        if (column1==row2) {


            for (int i=0; i<row1; i++) {
                for (int j=0; j<column1; j++) {
                    System.out.println("Value for (" + i + ", " + j + ") of the FIRST matrix: ");
                    m1[i][j] = in.nextInt();
                }
            }

            for (int i=0; i<row2; i++) {
                for (int j=0; j<column2; j++) {
                    System.out.println("Value for (" + i + ", " + j + ") of the SECOND matrix: ");
                    m2[i][j] = in.nextInt();
                }
            }

            for (int i=0; i<row1; i++) {
                for (int j=0; j<column2; j++) {
                    for (int k =0; k< column1; k++) {
                        result[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }

            for (int i=0; i<row1; i++) {
                for (int j=0; j< column2; j++) {
                    System.out.print("\n" + result[i][j]);
                }
            }
        }

        else
            System.out.println("Enter a valid information");

    }
}