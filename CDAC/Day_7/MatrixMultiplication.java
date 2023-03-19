import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of first matrix: ");
        int rows1 = input.nextInt();
        System.out.print("Enter the number of columns of first matrix: ");
        int columns1 = input.nextInt();
        System.out.print("Enter the number of rows of second matrix: ");
        int rows2 = input.nextInt();
        System.out.print("Enter the number of columns of second matrix: ");
        int columns2 = input.nextInt();
        if(columns1 != rows2) {
            System.out.println("The matrices cannot be multiplied.");
            return;
        }
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        int[][] result = new int[rows1][columns2];
        System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < columns1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < rows2; i++) {
            for(int j = 0; j < columns2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < columns2; j++) {
                for(int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("The product of the two matrices is:");
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
