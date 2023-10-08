public class Tester {
    public static void main(String[] args){
        Board b1 = new Board();
        if(b1.WhatGame()){
            b1.PrintBoardFas();
            b1.SetupFas();
        }
        else {
            b1.PrintBoardReg();
            b1.SetupReg();
        }
        System.out.println("");
    }
}
