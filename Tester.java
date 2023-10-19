import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        Setup setup = new Setup();
        PlayCpu cpu = new PlayCpu();
        PlayMan man = new PlayMan();
        int[][] game;
        int[][] guessBrd;
        int guessRow;
        int guessCol;
        if (board.Instructions()) { // would they like to play MAN(false) or CPU(true)

            if (board.WhatGame()) { // would they like to play fast(true) or normal(false)
                board.PrintBoardFas();
                System.out.println("");
                if (board.RandoNo()) {  // would they like to place ships manually(true) or randomly(false)
                    game = setup.SetupFas();
                } else {
                    game = setup.SetupCPUFas();
                }
            } else {
                board.PrintBoardReg();
                System.out.println("");
                if (board.RandoNo()) {  // would they like to place ships manually(true) or randomly(false)
                    game = setup.SetupReg();
                } else {
                    game = setup.SetupCPUReg();
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
                    if (game[guessRow][guessCol] ==  1) {
                        System.out.println("HIT!");
                        guessBrd[guessRow][guessCol] = 1;
                    }
                }
                while (d)
            }

        } else {

            if (board.WhatGame()) { // would they like to play fast(true) or normal(false)
                board.PrintBoardFas();
                System.out.println("");
                if (board.RandoNo()) {  // would they like to place ships manually(true) or randomly(false)
                    game = setup.SetupFas();
                } else {
                    game = setup.SetupCPUFas();
                }
            } else {
                board.PrintBoardReg();
                System.out.println("");
                if (board.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    game = setup.SetupReg();
                } else {
                    game = setup.SetupCPUReg();
                }
            }

        }

        System.out.println("");

    }
}
