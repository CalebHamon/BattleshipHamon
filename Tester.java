public class Tester {
    public static void main(String[] args){
        Board b1 = new Board();
        CPUGame g1 = new CPUGame();
        if(b1.WhatGame()){
            b1.PrintBoardFas();
            System.out.println("");
            g1.SetupFas();
        }
        else {
            b1.PrintBoardReg();
            System.out.println("");
            b1.SetupReg();
        }
        System.out.println("");
        
    }
}
