
/*
Assignment from Udacity.
A word game to guess the movie. This program prompts the user to guess the movie name.
List of movies to be guessed is stored in the movie list file. If the guess is correct it will be shown
in the output. User can incorrectly guess only 10 wrong letters.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class GuessTheMovie {

    private String movieFileName;
    private String toGuess;
    private int correctGuess;
    private int movieLength;

    public GuessTheMovie(){

        movieFileName = "movie_list.txt";
        toGuess = " ";
        correctGuess = 0;
        movieLength = 0;

    }

// Get the movie list from fle and return one random movie.


    private String getMovie() {

        String [] movieList = new String[30];
        try {

            File myFile = new File(movieFileName);
            Scanner scanner = new Scanner(myFile);
            int movieCount = 0;

            while (scanner.hasNextLine()) {
                movieList[movieCount] = scanner.nextLine();
                movieCount += 1;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int randomNumber = (int) (Math.random() * 10) ;

        System.out.println(" Welcome to movie guesser game!!!");
        System.out.println(" Only 5 incorrect guesses are allowed.");
        System.out.println(" Length of the movie is "+ movieList[randomNumber].length());

        return movieList[randomNumber];
    }

    private boolean validateInput(String input){
        boolean validString = false;
        if(input.length() > 1){
            System.out.println("You can enter only one alphabet at a time");
        } else if(input.trim().isEmpty()) {
            System.out.println("Space is not valid. Please enter a valid input");
        } else if(input.matches("[0-9 ]+")) {
            System.out.println("Numbers are not allowed. Please try again");
        } else {
            validString = true;
        }

        return validString;

    }

    private int [] inputMatch(String input, String movieName) {
//  indexOf method will return the index of the first occurrence if present, and -1 if not
        int[] occurs = new int[movieName.length()];
        int count = 0;
        int index = 0;
        for (int idx = 0; idx <= movieName.length(); idx++){

            index = movieName.indexOf(input, index);
            if(index >= 0) {
                occurs[count] = index + 1;
                count += 1;
                index += 1;
            }else {
                break;
            }

        }

        return occurs;
    }
    public void startGame() {
        toGuess = getMovie();
        String regex = "\\w";
        String maskInp = toGuess.replaceAll(regex,"_");

        char [] maskedChar = new char[maskInp.length()];
        maskedChar = maskInp.toCharArray();

        boolean validInput = false;
        String enteredVal = "";
        int wrongGuess = 0;
        int totGuess = 0;
        char [] guessVal;
        int remAttempt = 5;
        boolean guessIncomp = true;
        char underscore = '_';
        System.out.println(maskInp);

        while (wrongGuess < 5 && guessIncomp) {

            remAttempt = 5 - wrongGuess;
            while (!validInput) {
                System.out.println("Guess a letter. "+ remAttempt + " of 5 guess remaining");
                Scanner readInput = new Scanner(System.in);
                enteredVal = readInput.nextLine();
                enteredVal = enteredVal.toLowerCase();
                validInput = validateInput(enteredVal);
            }
            validInput = false;
            totGuess += 1;
            guessVal = enteredVal.toCharArray();

            int [] matched = inputMatch(enteredVal, toGuess);

            boolean isAllNonZero = false;
            int sum = 0;
            for(int i=0; i<matched.length; i++) {

                sum += matched[i];
            }
            if(sum >0) {
                isAllNonZero = false;
            }else {
                isAllNonZero = true;
            }

            if(isAllNonZero) {
                wrongGuess += 1;
                System.out.println("You have guessed "+ wrongGuess + " wrong letters in total of "+" 5 guess");
                System.out.println(maskedChar);

            } else {
                for(int i = 0; i < matched.length; i++) {
                    int indexVal = matched[i];
                    if(indexVal != 0) {
                        maskedChar[indexVal - 1] = guessVal[0];
                    }
                }
                System.out.println(maskedChar);
            }
            // check if the array has any more "_".
            guessIncomp = false;
            for (char element : maskedChar) {
                if (element == underscore) {
                    guessIncomp =  true;
                    break;
                }
            }
        }

        // Check if user has won or exhausted all chances to guess.

        if(wrongGuess >= 5 || guessIncomp) {
            System.out.println("You have exhausted the allowed attempts to guess");
            System.out.println("Movie Name is:" + toGuess);
        } else {
            System.out.println("Congratulations!!! You have guessed it right");
        }

    }
}
