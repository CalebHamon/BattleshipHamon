import java.util.Scanner;

public class CPUGame {

    int numCols = 10;
    int numRows = 10;
    int newRow;
    int newCol;

    int[][] game = new int[numRows][numCols];

    // Method that will eventually host the actual playing of the game

    // Method that ask someone for where they would like to play their pieces
    // Still need to work on errors for if it is out of bounds and if they type in
    // 'one'
    // SetupFas and SetupReg are the same for the exception that Fast has less ships

    // Also I need to add a random option for the user to randomly place ships
    // I think I will do a random number between 1 and 2, one being put the boat
    // in the same Col and 2 being put the boat in the same Row
    // Then have another random num generator from 1-8, where if it adds a peg to
    // that number to either side
    // of either the row or the col. For the exception of 1 and 8 where I would do
    // the 2 place next to the peg
    // that would be in the middle
    // TO DO: Correct names of ships, I think some of them are off still.

    public void SetupFas() {
        int containerCols = 0;
        int containerRows = 0;
        int fNumCols = 8;
        int fNumRows = 8;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Choose Location of Carrier");
            for (int q = 0; q < 3; q++) {
                System.out.println("What Row would you like to place the peg of your cruiser in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("Choose Location of Submarine");
            for (int q = 0; q < 3; q++) {
                System.out.println("What Row would you like to place the peg of your submarine in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("Choose Location of Destroyer");
            for (int q = 0; q < 2; q++) {
                System.out.println("What Row would you like to place the peg of your destroyer in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("");
            System.out.println("Your Board:");
            System.out.println("");
            for (int p = 0; p < fNumCols; p++) {
                for (int c = 0; c < fNumRows; c++) {
                    System.out.print(game[p][c]);
                    System.out.print(" ");
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }

    }

    public void SetupReg() {
        int containerCols = 0;
        int containerRows = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Choose Location of Carrier");
            for (int q = 0; q < 5; q++) {
                System.out.println("What Row would you like to place the peg of your carrier in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("Choose Location of Battleship");
            for (int q = 0; q < 4; q++) {
                System.out.println("What Row would you like to place the peg of your battleship in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("Choose Location of Cruiser");
            for (int q = 0; q < 3; q++) {
                System.out.println("What Row would you like to place the first peg of your cruiser in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("Choose Location of Submarine");
            for (int q = 0; q < 3; q++) {
                System.out.println("What Row would you like to place the first peg of your submarine in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            }
            System.out.println("Choose Location of Destroyer");
            for (int q = 0; q < 2; q++) {
                System.out.println("What Row would you like to place the first peg of your destroyer in?");
                newRow = scan.nextInt() - 1;
                System.out.println("What Column");
                newCol = scan.nextInt() - 1;
                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
                scan.close();

            }

        } catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }

        // scan.close();

    }
}
