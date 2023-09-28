import java.util.Scanner;

public class Board {
    
    int numRows = 10;
    int numCols = 10;
    int[] ships = new int[5];
    int newRow;

    int[][] game = new int[numRows][numCols];

    //Setup
    public void Setup() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
        newRow = scan.nextInt();

    }

    //play


    public void PrintBoard() {
        for (int i = 0; i < numCols; i++){
            for (int r = 0; r <numRows; r++){
                System.out.print(game[i][r]);
            }
            System.out.println("");
        }
    }
}