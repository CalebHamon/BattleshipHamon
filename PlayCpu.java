import java.util.Scanner;

public class PlayCpu {

    //Where guessing implementations is created for both fast and reg games
    //This goes through from FastCPUColGuess to RegCPURowGuess
    //TO DO: Error control: I have not tested these methods yet, so I am sure there is bound to be some error, but to the eye it looks good to me.
    
    public static int FastCPUColGuess() {
    
        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
        System.out.println("What Col Would you like to guess?");
        colGuess = scan.nextInt();
        }
        while (!(colGuess < 1 && colGuess > 8));
        scan.close();
        return colGuess;
    }

    public static int FastCPURowGuess() {
    
        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
        System.out.println("What Row Would you like to guess?");
        rowGuess = scan.nextInt();
        }
        while (!(rowGuess < 1 && rowGuess > 8));
        scan.close();
        return rowGuess; 
    }

    public static int RegCPUColGuess() {
    
        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
        System.out.println("What Col Would you like to guess?");
        colGuess = scan.nextInt();
        }
        while (!(colGuess < 1 && colGuess > 10));
        scan.close();
        return colGuess;
    }

    public static int RegCPURowGuess() {
    
        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
        System.out.println("What Row Would you like to guess?");
        rowGuess = scan.nextInt();
        }
        while (!(rowGuess < 1 && rowGuess > 10));
        scan.close();
        return rowGuess; 
    }
    
}
