public class Tester {
    
    //The main method brings all of the classes together
    //This is where all the prompts and input will be put all togehter to make Battlship
    //TO DO: I still need to implement a way to check the guesses. I think I will do it here.
    //I will do it by checking if game[num][num] equals one, if so then hit and if not then it is not a hit
    //If it is not a hit then change it to be a 2, but if it is then make it another number such as 3. Then I can
    //use these number to then check if the guess has been made and also where the hits are. After there are no more zeros then call a method that ends game
    //Also I need to add the classes and methods from the new classes and methods I made yesterday.

    //TO DO (NOT IN THIS METHOD THOUGH): Create a random placement method that way it can be used for both the user and CPU.
    //Also a way to loop the games to make sure it doesnt end prematurely and also prompt the user if they would like to play again.
    //I think I could do this by a do while loop for the former and a conditional for if they would like to play again.
    //Also need to create a board for guessing, though shouldnt be too hard considering I have already made another method similar to it
    

    
    public static void main(String[] args){
        Board b1 = new Board();
        Setup s1 = new Setup();
        s1.SetupCPUFas();
        if (b1.Instructions()){ //would they like to play MAN(false) or CPU(true)

            if(b1.WhatGame()){ //would they like to play fast(true) or normal(false)
                int[][] game = new int[7][7];
                b1.PrintBoardFas();
                System.out.println("");
                s1.SetupFas();
                }
            else {
                int[][] game = new int[9][9];
                b1.PrintBoardReg();
                System.out.println("");
                s1.SetupReg();
            }

        }
        else {

            if(b1.WhatGame()){ //would they like to play fast(true) or normal(false)
                int[][] game = new int[7][7];
                b1.PrintBoardFas();
                System.out.println("");
                s1.SetupFas();
                }
            else {
                int[][] game = new int[9][9];
                b1.PrintBoardReg();
                System.out.println("");
                s1.SetupReg();
                }   


        }
        
        System.out.println("");
        
    }
}
