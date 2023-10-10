import java.util.Scanner;

public class CPUGame {

    int numCols = 10;
    int numRows = 10;
    int newRow;
    int newCol;
    
    
    int[][] game = new int[numRows][numCols];

    public void FastCPUSetup() {
    

    }
    
    public void SetupFas() {
        int fNumCols = 8;
        int fNumRows = 8;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
        for (int q = 0; q<3; q++){
            System.out.println("What Row would you like to place the peg of your cruiser in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("Choose Location of Submarine");
        for (int q = 0; q<3; q++){
            System.out.println("What Row would you like to place the peg of your submarine in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("Choose Location of Destroyer");
        for (int q = 0; q<2; q++){
            System.out.println("What Row would you like to place the peg of your destroyer in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("");
        System.out.println("Your Board:");
        System.out.println("");
        for (int p = 0; p < fNumCols; p++){
            for (int c = 0; c <fNumRows; c++){
                System.out.print(game[p][c]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }



    public void SetupReg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
            for (int q = 0; q<5; q++){
                System.out.println("What Row would you like to place the peg of your carrier in?");
                newRow = scan.nextInt() -1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
               game[newRow][newCol] = 1;
            }
            System.out.println("Choose Location of Battleship");
            for (int q = 0; q<4; q++){
                System.out.println("What Row would you like to place the peg of your battleship in?");
                newRow = scan.nextInt() -1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                game[newRow][newCol] = 1;
            }
            System.out.println("Choose Location of Cruiser");
            for (int q = 0; q<3; q++){
                System.out.println("What Row would you like to place the first peg of your cruiser in?");
                newRow = scan.nextInt() -1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                game[newRow][newCol] = 1;
            }
            System.out.println("Choose Location of Submarine");
            for (int q = 0; q<3; q++){
                System.out.println("What Row would you like to place the first peg of your submarine in?");
                newRow = scan.nextInt() -1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                game[newRow][newCol] = 1;
            }
            System.out.println("Choose Location of Destroyer");
            for (int q = 0; q<2; q++){
                System.out.println("What Row would you like to place the first peg of your destroyer in?");
                newRow = scan.nextInt() -1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                game[newRow][newCol] = 1;
            }

    }
}
