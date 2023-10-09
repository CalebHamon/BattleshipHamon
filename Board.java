import java.util.Scanner;

public class Board {
    
    int numRows = 10;
    int numCols = 10;
    int fNumCols = 8;
    int fNumRows = 8;
    int[] ships = new int[5];
    int newRow;
    int newCol;

    int[][] game = new int[numRows][numCols];

    public static boolean Instructions() {
        String newInst;
        String playerSelec;
        String yayer = "YES";
        String noer = "NO";
        boolean cup;
       Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to BATTLESHIP!");
        System.out.println("Would you like to  learn how to play?");
        do {
            newInst = scan.nextLine();
        }
        while (!(newInst.toUpperCase().equals(yayer)) || !(newInst.toUpperCase().equals(noer)));
        if ((newInst.toUpperCase().equals(yayer))) {
            System.out.println("BATTLESHIP is a guessing game, where each opponent takes turns guessing coordinates ");
            System.out.println("Each turn players will the oppurtunity to guess a location in which they think their opponents ships are");
            System.out.println("If they hit a ship, the computer will say that it did so, and same if it missed or you sinked a ship");
            System.out.println("The goal by the end of the game is to sink all of your opponents ships before they sink yours");
        }
        System.out.println("Would you like to play CPU or player 2 (on the same computer)");
        System.out.println("Say 'YES' if you would like to play CPU and 'NO' if you would like to play someone on your computer");
        do {
        playerSelec = scan.nextLine();
        }
        while (!(playerSelec.toUpperCase().equals(yayer)) || !(playerSelec.toUpperCase().equals(noer)));
        if ((playerSelec.toUpperCase().equals(yayer))) {
            cup = true;
        }
        else {
            cup = false;
        }
        return cup;

    }

    //Setup

    //what game?
    public static boolean WhatGame() {
        Scanner scan = new Scanner(System.in);
        String pickbrd; 
        String fast = "FAST";
        String reg = "NORMAL";
        boolean fastOReg;

        do {
            System.out.println("What game would you like to play, Fast or Normal?");
            pickbrd = scan.nextLine();
        }
        while (!(pickbrd.toUpperCase().equals(fast) || pickbrd.toUpperCase().equals(reg)));
            
        if (pickbrd.toUpperCase().equals(fast)) {
                System.out.println("");
                fastOReg = true;
            }
        else {
            System.out.println("");
            fastOReg = false;
        }
        return fastOReg;
        }

    



    // Ship Setup
    
    // fastOReg = false, go to setupReg, if true then go to a fastReg, with limited ships

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

    //play


    public void PrintBoardReg() {
        for (int i = 0; i < numCols; i++){
            for (int r = 0; r <numRows; r++){
                System.out.print(game[i][r]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public void PrintBoardFas() {
        for (int p = 0; p < fNumCols; p++){
            for (int c = 0; c <fNumRows; c++){
                System.out.print(game[p][c]);
            }
            System.out.println("");
        }
    }
}