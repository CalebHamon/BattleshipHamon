public class Tester {
    public static void main(String[] args){
        Board b1 = new Board();
        CPUGame c1 = new CPUGame();
        ManualGame m1 = new ManualGame();
        if (b1.Instructions()){

            if(b1.WhatGame()){
                b1.PrintBoardFas();
                System.out.println("");
                c1.SetupFas();
                }
            else {
                b1.PrintBoardReg();
                System.out.println("");
                c1.SetupReg();
            }

        }
        else {

            if(b1.WhatGame()){
                b1.PrintBoardFas();
                System.out.println("");
                m1.SetupFas();
                }
            else {
                b1.PrintBoardReg();
                System.out.println("");
                m1.SetupReg();
                }   


        }
        
        System.out.println("");
        
    }
}
