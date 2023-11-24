
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;


public class Game {
<<<<<<< HEAD
    private char[] currentState;
    private char[] enigma;
    private int status = 0;
    private TreeSet<Character> guesses = new TreeSet<>();
    private PreparingTheRiddle preparingTheRiddle = new PreparingTheRiddle();
    private TextMessages textMessages = new TextMessages();
    private UserInput userInput = new UserInput();
    private Drawings drawings = new Drawings();
=======
    public char[] currentState;
    public char[] enigma;
    int status = 0;
    TreeSet<Character> guesses = new TreeSet<>();
    PreparingTheRiddle preparingTheRiddle = new PreparingTheRiddle();
    TextMessages textMessages = new TextMessages();
    UserInput userInput = new UserInput();
    Drawings drawings = new Drawings();
>>>>>>> origin/master


    public Game() throws IOException {
        textMessages.greetingMessage();
        gameOn();
<<<<<<< HEAD
        //    System.out.println(Arrays.toString(enigma));
        //    System.out.println(Arrays.toString(currentState));
        while (true) {
            textMessages.printCurrentState(currentState);
            char answer = userInput.userInput(guesses);
            if (checkAnswer(answer)) {
                rightAnswer(answer);
            } else {
                wrongAnswer(answer);
            }
            if (Arrays.equals(enigma, currentState)) {
                youWon();
            }
            if (status == drawings.getDrawings().length - 1) {
=======
    //    System.out.println(Arrays.toString(enigma));
    //    System.out.println(Arrays.toString(currentState));
        while(true) {
            textMessages.printCurrentState(currentState);
            char answer = userInput.userInput(guesses);
            if(checkAnswer(answer)){
               rightAnswer(answer);
            }
            else{
                wrongAnswer(answer);
            }
            if(Arrays.equals(enigma, currentState)){
                youWon();
            }
            if(status== drawings.getDrawings().length-1){
>>>>>>> origin/master
                youLost();
            }
        }
    }

<<<<<<< HEAD
    private boolean checkAnswer(char answer) {
        boolean isCorrect = false;
        for (char ch : enigma) {
            if (answer == ch) {
                isCorrect = true;
=======
    public boolean checkAnswer(char answer){
        boolean isCorrect = false;
        for(char ch : enigma){
            if(answer == ch){
                isCorrect= true;
>>>>>>> origin/master
                break;
            }
        }
        return isCorrect;
    }


<<<<<<< HEAD
    private boolean gameOn() throws IOException {
        textMessages.startGame();
        char yn = userInput.userYNInput();
        if (yn == 'y') {
=======

    private boolean gameOn() throws IOException {
        textMessages.startGame();
        char yn = userInput.userYNInput();
        if(yn=='y'){
>>>>>>> origin/master
            char[][] enigmaAndCurrentState = preparingTheRiddle.preparingGame();
            enigma = enigmaAndCurrentState[0];
            currentState = enigmaAndCurrentState[1];
            status = 0;
            textMessages.timeToGuess();
            return true;
<<<<<<< HEAD
        } else {
=======
        }
        else{
>>>>>>> origin/master
            textMessages.goodByeMessage();
            userInput.br.close();
            System.exit(1);
            return false;
        }
    }
<<<<<<< HEAD

    private void wrongAnswer(char answer) {
=======
    private void wrongAnswer(char answer){
>>>>>>> origin/master
        status++;
        textMessages.wrongAnswerMessage();
        guesses.add(answer);
        textMessages.printGuesses(guesses);
        textMessages.printCurrentState(currentState);
        drawings.printDrawing(status);
    }
<<<<<<< HEAD

    private void rightAnswer(char answer) {
        for (int i = 0; i < currentState.length; i++) {
            if (enigma[i] == answer) {
=======
    private void rightAnswer(char answer){
        for(int i= 0; i < currentState.length; i++){
            if(enigma[i] == answer){
>>>>>>> origin/master
                currentState[i] = answer;
            }
        }
        textMessages.rightAnswerMessage();
        guesses.add(answer);
        textMessages.printGuesses(guesses);
        textMessages.printCurrentState(currentState);
        drawings.printDrawing(status);
    }
<<<<<<< HEAD

=======
>>>>>>> origin/master
    private void youWon() throws IOException {
        textMessages.youWonMessage();
        guesses.clear();
        gameOn();
    }
<<<<<<< HEAD

=======
>>>>>>> origin/master
    private void youLost() throws IOException {
        textMessages.gameOver();
        System.out.print("                             Word was: ");
        for (char ch : enigma) {
            System.out.print(ch);
        }
        System.out.println();
        guesses.clear();
        gameOn();
    }
}
