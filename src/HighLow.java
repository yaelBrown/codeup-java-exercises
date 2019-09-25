import java.lang.Math;
import java.util.Scanner;

public class HighLow {

    public static int randomNumber = 0;

    public static int guessedNum = 0;

    public static int numOfGuesses = 0;

    public static void generateRandomNumber() {
        randomNumber = (int) (Math.random() * 100);
    }



    public static void main(String[] args) {

        generateRandomNumber();

//        System.out.println(randomNumber);

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the randomly generated number! : ");
        guessedNum = sc.nextInt();

        while(guessedNum != randomNumber) {
            if (guessedNum == 269) System.out.println("Cheat Codes Activated! Enter " + randomNumber + " to win!");

            if (guessedNum > randomNumber) {
                System.out.println("Guess a lower number!");
                numOfGuesses++;
            } else if (guessedNum < randomNumber) {
                System.out.println("Guess a higher number!");
                numOfGuesses++;
            }

            guessedNum = sc.nextInt();
        }

        sc.close();

        System.out.println("Congrats! You guessed " + randomNumber + " in " + numOfGuesses + " guesses!\n");
        System.out.println("Try again and guess in fewer numbers next time!");


    }





















}
