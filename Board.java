import java.util.Scanner;

public class Board {
    
    int numRows = 10;
    int numCols = 10;
    int[] ships = new int[5];
    int newRow;
    int newCol;

    int[][] game = new int[numRows][numCols];

    //Setup
    public void Setup() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
        for (int q = 0; q<5; q++){
            System.out.println("What Row would you like to place the first peg of your carrier in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column>");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }

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