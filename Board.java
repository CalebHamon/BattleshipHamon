import java.util.Scanner;

public class Board {
    
    int numRows = 10;
    int numCols = 10;
    int[] ships = new int[5];
    int newRow;
    int newCol;
    String pickbrd; 
    String fast = "FAST";
    String reg = "REGULAR";
    boolean fastOReg;

    int[][] game = new int[numRows][numCols];

    //Setup

    //what game?
    public void WhatGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What game would you like to play, Fast or Normal?");
        pickbrd = scan.nextLine();
        if (pickbrd.toUpperCase().equals.fast) {
            fastOReg = true;
        }
        else {
            fastOReg = false;
        }

    }



    // Ship Setup
    public void SetupReg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
        for (int q = 0; q<5; q++){
            System.out.println("What Row would you like to place the peg of your carrier in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column>");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("Choose Location of Battleship");
        for (int q = 0; q<4; q++){
            System.out.println("What Row would you like to place the peg of your battleship in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column>");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("Choose Location of Cruiser");
        for (int q = 0; q<3; q++){
            System.out.println("What Row would you like to place the first peg of your cruiser in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column>");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("Choose Location of Submarine");
        for (int q = 0; q<3; q++){
            System.out.println("What Row would you like to place the first peg of your submarine in?");
            newRow = scan.nextInt() -1;
            System.out.println("What Column>");
            newCol = scan.nextInt() - 1;
            game[newRow][newCol] = 1;
        }
        System.out.println("Choose Location of Destroyer");
        for (int q = 0; q<2; q++){
            System.out.println("What Row would you like to place the first peg of your destroyer in?");
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