import java.util.Scanner;

public class PlayMan {

    // Where guessing implementations is created for both fast and reg games
    // This goes through from FastManColGuess to RegManRowGuess
    // These have different methods for each User, making it easier to keep track of
    // who guessed what
    // TO DO: Error control: I have not tested these methods yet, so I am sure there
    // is bound to be some error, but to the eye it looks good to me.
    // Also might need to do a way to hide each board that way there is no cheating

    public static int FastManColGuessU1() {

        try (Scanner scan = new Scanner(System.in)) {
            int colGuess;
            System.out.println("Place a guess!");
            do {
                System.out.println("What Col Would you like to guess?");
                colGuess = scan.nextInt();
            } while (!(colGuess < 1 && colGuess > 8));
            // scan.close();
            return colGuess;
        } catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int FastManRowGuessU1() {

        try (Scanner scan = new Scanner(System.in)) {
            int rowGuess;
            do {
                System.out.println("What Row Would you like to guess?");
                rowGuess = scan.nextInt();
            } while (!(rowGuess < 1 && rowGuess > 8));
            // scan.close();
            return rowGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int RegManColGuessU1() {

        try (Scanner scan = new Scanner(System.in)) {
            int colGuess;
            System.out.println("Place a guess!");
            do {
                System.out.println("What Col Would you like to guess?");
                colGuess = scan.nextInt();
            } while (!(colGuess < 1 && colGuess > 10));
            // scan.close();
            return colGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int RegManRowGuessU1() {

        try (Scanner scan = new Scanner(System.in)) {
            int rowGuess;
            do {
                System.out.println("What Row Would you like to guess?");
                rowGuess = scan.nextInt();
            } while (!(rowGuess < 1 && rowGuess > 10));
            // scan.close();
            return rowGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int FastManColGuessU2() {

        try (Scanner scan = new Scanner(System.in)) {
            int colGuess;
            System.out.println("Place a guess!");
            do {
                System.out.println("What Col Would you like to guess?");
                colGuess = scan.nextInt();
            } while (!(colGuess < 1 && colGuess > 8));
            // scan.close();
            return colGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int FastManRowGuessU2() {

        try (Scanner scan = new Scanner(System.in)) {
            int rowGuess;
            do {
                System.out.println("What Row Would you like to guess?");
                rowGuess = scan.nextInt();
            } while (!(rowGuess < 1 && rowGuess > 8));
            // scan.close();
            return rowGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int RegManColGuessU2() {

        try (Scanner scan = new Scanner(System.in)) {
            int colGuess;
            System.out.println("Place a guess!");
            do {
                System.out.println("What Col Would you like to guess?");
                colGuess = scan.nextInt();
            } while (!(colGuess < 1 && colGuess > 10));
            // scan.close();
            return colGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

    public static int RegManRowGuessU2() {

        try (Scanner scan = new Scanner(System.in)) {
            int rowGuess;
            do {
                System.out.println("What Row Would you like to guess?");
                rowGuess = scan.nextInt();
            } while (!(rowGuess < 1 && rowGuess > 10));
            // scan.close();
            return rowGuess;
        }

        catch (Exception e) {
            System.out.println("Something went wrong, please rerun " + e.toString());
        }
        return 11;

    }

}