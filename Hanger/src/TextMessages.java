<<<<<<< HEAD
import java.util.TreeSet;

public class TextMessages {
//    UserInput userInput = new UserInput();

    public TextMessages() {
    }

    public void greetingMessage() {
=======
import java.util.ArrayList;
import java.util.TreeSet;

public class TextMessages {
    UserInput userInput = new UserInput();
    public TextMessages() {
    }
    public void greetingMessage(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                           Greetings traveler!");
        System.out.println("                          Welcome to hangman game");
        System.out.println("                            It's time to guess!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void wrongAnswerMessage() {
=======
    public void wrongAnswerMessage(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                             That's wrong!");
        System.out.println("                          Try one more time....");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void gameOver() {
=======
    public void gameOver(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                           That's wrong again!");
        System.out.println("                         It's time to sleep now...");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void rightAnswerMessage() {
=======
    public void rightAnswerMessage(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                               That's right!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void youWonMessage() {
=======
    public void youWonMessage(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                           That's right!");
        System.out.println("                              You won!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

<<<<<<< HEAD
    public void goodByeMessage() {
=======
    public void goodByeMessage(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                           Farewell traveler!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void printGuesses(TreeSet<Character> guesses) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("                               Your tries: ");
        for (Character ch : guesses) {
=======
    public void printGuesses(TreeSet<Character> guesses){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("                               Your tries: ");
        for (Character ch : guesses){
>>>>>>> origin/master
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void startGame() {
=======
    public void startGame(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                           Wanna new game? Y/N?");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
<<<<<<< HEAD

    public void printCurrentState(char[] currentState) {
        System.out.println();
        for (char c : currentState) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void timeToGuess() {
=======
    public void printCurrentState(char [] currentState){
        System.out.println();
        for (char c : currentState){
            System.out.print(c+" ");
        }
        System.out.println();
    }
    public void timeToGuess(){
>>>>>>> origin/master
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            It's time to guess!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
