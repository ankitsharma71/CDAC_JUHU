import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for(int i = 0; i < columns; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
