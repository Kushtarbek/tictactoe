import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Arrays;
import java.util.Scanner;

public class GameController {
    public static final int CROSS = 0;
    public static final int Zero = 0;
    public static int currentPlayer;
    public static int DRAW;
    public static final int ROWS = 3, COLS = 3;
    public static int[][] board = new int[ROWS][COLS];


    public static void print2D(int mat[][]) {
        for (int[] row : mat)
            // converting each row as string
            // and then printing in a separate line
            System.out.println( Arrays.toString(row));


    }




     @SuppressFBWarnings("DM_DEFAULT_ENCODING")
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean validInput = false;
        do{
            if(currentPlayer == CROSS){
                System.out.println("Game has started! Player 1, enter your move: ");
            }else{
                System.out.println("Player 2, enter your move: ");
            }
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            if(row >= 0 && row < ROWS && col >= 0 && col < COLS){
                validInput = true;
            }else{
                System.out.println("This move is not valid. Try again ...");
            }
        }while( !validInput);

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
