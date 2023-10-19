import java.util.Scanner;
import java.util.Random;

public class PlayCpu {

    // Where guessing implementations is created for both fast and reg games
    // This goes through from FastCPUColGuess to RegCPURowGuess
    // TO DO: Error control: I have not tested these methods yet, so I am sure there
    // is bound to be some error, but to the eye it looks good to me.

    public int FastCPUColGuess() {

        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
            System.out.println("What Col Would you like to guess?");
            colGuess = scan.nextInt();
        } while ((colGuess < 1 && colGuess > 8));
        colGuess = colGuess - 1;
        // scan.close();
        return colGuess;

    }

    public int FastCPURowGuess() {

        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
            System.out.println("What Row Would you like to guess?");
            rowGuess = scan.nextInt();
        } while ((rowGuess < 1 && rowGuess > 8));
        rowGuess = rowGuess - 1;
        // scan.close();
        return rowGuess;

    }

    public int RegCPUColGuess() {

        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
            System.out.println("What Col Would you like to guess?");
            colGuess = scan.nextInt();
        } while ((colGuess < 1 && colGuess > 10));
        // scan.close();
        colGuess = colGuess - 1;
        return colGuess;

    }

    public int RegCPURowGuess() {

        Scanner scan = new Scanner(System.in);
        int rowGuess = 1;
        int work = 1;
        for(int i = 0; i < work; i++ ){
            System.out.println("What Row Would you like to guess?");
            rowGuess = scan.nextInt();
            rowGuess = rowGuess - 1;
            if (rowGuess >= 1 && rowGuess <=10){
                return rowGuess;
            }
            else{
                i = -1;
            }
        }
        // scan.close();
        return rowGuess;
    }

    public int FasCPURowGuessRan() {
        int rowguess;
        Random random = new Random();
        rowguess = random.nextInt(8);
        return rowguess;
    }

    public int FasCPUColGuessRan() {
        int colguess;
        Random random = new Random();
        colguess = random.nextInt(8);
        return colguess;
    }

    public int RegCPURowGuessRan() {
        int rowguess;
        Random random = new Random();
        rowguess = random.nextInt(8);
        return rowguess;
    }

    public int RegCPUColGuessRan() {
        int colguess;
        Random random = new Random();
        colguess = random.nextInt(8);
        return colguess;
    }
}
