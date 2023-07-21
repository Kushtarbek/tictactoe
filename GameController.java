import java.util.Arrays;
import java.util.Scanner;

public class GameController {
    public static void print2D(int mat[][])
    {
        for (int[] row : mat)
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));

    }

    public static void enterMatrixData(Scanner scan, int [][] matrix, int matrixRow, int matrixCol){
        System.out.println("Enter matrix data");
        for( int i =0; i< matrixRow; i++){
            for( int j = 0; j<matrixCol; j++){

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please go ahead: ");
        System.out.println(sc.nextLine());
        int[][] matrix = new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                matrix[r][c] = sc.nextInt();
            }
        }
        System.out.println(matrix);
        print2D(matrix);
    }
}
