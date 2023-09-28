public class Board {

    int numRows = 10;
    int numCols = 10;
    int[] ships = new int[5];

    int[][] game = new int[numRows][numCols];


    public void PrintBoard() {
        for (int i = 0; i < numCols; i++){
            for (int r = 0; r <numRows; r++){
                System.out.print(game[i][r]);
            }
            System.out.println("");
        }
    }
}