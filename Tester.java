public class Tester {

    // The main method brings all of the classes together
    // This is where all the prompts and input will be put all togehter to make
    // Battlship
    // TO DO: I still need to implement a way to check the guesses. I think I will
    // do it here.
    // I will do it by checking if game[num][num] equals one, if so then hit and if
    // not then it is not a hit
    // If it is not a hit then change it to be a 2, but if it is then make it
    // another number such as 3. Then I can
    // use these number to then check if the guess has been made and also where the
    // hits are. After there are no more zeros then call a method that ends game
    // Also I need to add the classes and methods from the new classes and methods I
    // made yesterday.

    // TO DO (NOT IN THIS METHOD THOUGH): Create a random placement method that way
    // it can be used for both the user and CPU.
    // Also a way to loop the games to make sure it doesnt end prematurely and also
    // prompt the user if they would like to play again.
    // I think I could do this by a do while loop for the former and a conditional
    // for if they would like to play again.
    // Also need to create a board for guessing, though shouldnt be too hard
    // considering I have already made another method similar to it

    public static void main(String[] args) {
        Board board = new Board();
        Setup setup = new Setup();
        PlayCpu cpu = new PlayCpu();
        PlayMan man = new PlayMan();
        int fasRow = 7;
        int fasCol = 7;
        int regRow = 9;
        int regCol = 9;
        int guessRow;
        int guessCol;
        boolean didWinU1 = false;
        int addWinU1 = 1;
        boolean didWinU2 = false;
        int addWinU2 = 1 ;
        if (board.Instructions()) { // would they like to play MAN(false) or CPU(true)

            if (board.WhatGame()) { // would they like to play fast(true) or normal(false)
                int[][] guessBrdU2 = new int[fasRow][fasCol];
                int[][] guessBrdU1 = new int[fasRow][fasCol];
                board.PrintBoardFas();
                System.out.println("");
                if (board.RandoNo()) {  // would they like to place ships manually(true) or randomly(false)
                    guessBrdU1 = setup.SetupFas();
                } else {
                    guessBrdU1 = setup.SetupCPUFas();
                }
                System.out.println("Here is the board you will be using for the rest of the game:");
                board.PrintBoardFas();
                System.out.println("");                
                System.out.println("1s Indicates HITS and 3s indicate a miss");
                System.out.println("GOOD LUCK!");
                do {
                    System.out.println("YOUR TURN!");
                    guessRow = cpu.FastCPURowGuess();
                    guessCol = cpu.FastCPUColGuess();
                    if (guessBrdU1[guessRow][guessCol] ==  3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = cpu.FastCPURowGuess();
                            guessCol = cpu.FastCPUColGuess();
                        } while (!(guessBrdU1[guessRow][guessCol] ==  3));
                    }
                    if (guessBrdU1[guessRow][guessCol] ==  1) {
                        System.out.println("HIT!");
                        guessBrdU1[guessRow][guessCol] = 1;
                    }
                    else {
                        System.out.println("miss");
                        guessBrdU1[guessRow][guessCol] = 3;
                    }
                        System.out.println("Your Board:");
                        System.out.println("");
                        for (int p = 0; p < fasCol; p++) {
                            for (int c = 0; c < fasRow; c++) {
                                System.out.print(guessBrdU1[p][c]);
                                System.out.print(" ");
                            }
                        System.out.println("");
                        }
                    do {
                        guessRow = cpu.FasCPURowGuessRan();
                        guessCol = cpu.FasCPURowGuessRan();
                    } while(!(guessBrdU2[guessRow][guessCol] == 3));
                    if (guessBrdU2[guessRow][guessCol] == 1){
                        System.out.println("The CPU Landed a HIT!");
                    }
                    else {
                        System.out.println("The CPU missed");
                    }
                    for (int p = 0; p < fasCol; p++) {
                            for (int c = 0; c < fasRow; c++) {
                                if(guessBrdU2[fasRow][fasCol] == 1){
                                    addWinU1++;
                                }
                                if(addWinU1 == 8){
                                    didWinU1 = true;
                                }
                                if(guessBrdU1[fasRow][fasCol] == 1){
                                    addWinU2++;
                                }
                                if(addWinU2 == 8){
                                    didWinU2 = true;
                                }
                            }
                
                        }
                    } while (!didWinU1 || !didWinU2 );
                    if (didWinU1){
                        System.out.println("YOU WON!!!!");
                        System.out.println("Rerun to play again!");
                    }
                    if (didWinU2){
                        System.out.println("You lost :(");
                        System.out.println("Rerun to play again!");
                    }
                    
                
            } else {
                int[][] guessBrdU2 = new int[regRow][regCol];
                int[][] guessBrdU1 = new int[regRow][regCol];
                board.PrintBoardReg();
                System.out.println("");
                if (board.RandoNo()) {  // would they like to place ships manually(true) or randomly(false)
                    guessBrdU1 = setup.SetupReg();
                } else {
                    guessBrdU1 = setup.SetupCPUReg();
                }
                System.out.println("Here is the board you will be using for the rest of the game:");
                board.PrintBoardFas();
                System.out.println("");                
                System.out.println("1s Indicates HITS and 3s indicate a miss");
                System.out.println("GOOD LUCK!");
                do {
                    System.out.println("YOUR TURN!");
                    guessRow = cpu.RegCPURowGuess();
                    guessCol = cpu.RegCPUColGuess();
                    if (guessBrdU1[guessRow][guessCol] ==  3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = cpu.RegCPURowGuess();
                            guessCol = cpu.RegCPUColGuess();
                        } while (!(guessBrdU1[guessRow][guessCol] ==  3));
                    }
                    if (guessBrdU1[guessRow][guessCol] ==  1) {
                        System.out.println("HIT!");
                        guessBrdU1[guessRow][guessCol] = 1;
                    }
                    else {
                        System.out.println("miss");
                        guessBrdU1[guessRow][guessCol] = 3;
                    }
                        System.out.println("Your New Board:");
                        System.out.println("");
                        for (int p = 0; p < regCol; p++) {
                            for (int c = 0; c < regRow; c++) {
                                System.out.print(guessBrdU1[p][c]);
                                System.out.print(" ");
                            }
                        System.out.println("");
                        }
                    do {
                        guessRow = cpu.RegCPURowGuessRan();
                        guessCol = cpu.RegCPURowGuessRan();
                    } while(!(guessBrdU2[guessRow][guessCol] == 3));
                    if (guessBrdU2[guessRow][guessCol] == 1){
                        System.out.println("The CPU Landed a HIT!");
                    }
                    else {
                        System.out.println("The CPU missed");
                    }
                    for (int p = 0; p < regCol; p++) {
                            for (int c = 0; c < regRow; c++) {
                                if(guessBrdU2[regRow][regCol] == 1){
                                    addWinU1++;
                                }
                                if(addWinU1 == 17){
                                    didWinU1 = true;
                                }
                                if(guessBrdU1[regRow][regCol] == 1){
                                    addWinU2++;
                                }
                                if(addWinU2 == 17){
                                    didWinU2 = true;
                                }
                            }
                
                        }
                    } while (!didWinU1 || !didWinU2 );
                    if (didWinU1){
                        System.out.println("YOU WON!!!!");
                        System.out.println("Rerun to play again!");
                    }
                    if (didWinU2){
                        System.out.println("You lost :(");
                        System.out.println("Rerun to play again!");
                    }
            

        } } else {

            if (board.WhatGame()) { // would they like to play fast(true) or normal(false)
                int[][] guessBrdU2 = new int[fasRow][fasCol];
                int[][] guessBrdU1 = new int[fasRow][fasCol];
                board.PrintBoardFas();
                System.out.println("");
                if (board.RandoNo()) {  // would they like to place ships manually(true) or randomly(false)
                    guessBrdU1 = setup.SetupFas();
                } else {
                    guessBrdU1 = setup.SetupCPUFas();
                }
            } else {
                int[][] guessBrdU2 = new int[regRow][regCol];
                int[][] guessBrdU1 = new int[regRow][regCol];
                board.PrintBoardReg();
                System.out.println("");
                if (board.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    guessBrdU1 = setup.SetupReg();
                } else {
                    guessBrdU1 = setup.SetupCPUReg();
                }
            }

        }

        System.out.println("");

    }
}

