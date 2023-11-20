
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;


public class Game {
    private char[] currentState;
    private char[] enigma;
    private int status = 0;
    private TreeSet<Character> guesses = new TreeSet<>();
    private PreparingTheRiddle preparingTheRiddle = new PreparingTheRiddle();
    private TextMessages textMessages = new TextMessages();
    private UserInput userInput = new UserInput();
    private Drawings drawings = new Drawings();


    public Game() throws IOException {
        textMessages.greetingMessage();
        gameOn();
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
                youLost();
            }
        }
    }

    private boolean checkAnswer(char answer) {
        boolean isCorrect = false;
        for (char ch : enigma) {
            if (answer == ch) {
                isCorrect = true;
                break;
            }
        }
        return isCorrect;
    }


    private boolean gameOn() throws IOException {
        textMessages.startGame();
        char yn = userInput.userYNInput();
        if (yn == 'y') {
            char[][] enigmaAndCurrentState = preparingTheRiddle.preparingGame();
            enigma = enigmaAndCurrentState[0];
            currentState = enigmaAndCurrentState[1];
            status = 0;
            textMessages.timeToGuess();
            return true;
        } else {
            textMessages.goodByeMessage();
            userInput.br.close();
            System.exit(1);
            return false;
        }
    }

    private void wrongAnswer(char answer) {
        status++;
        textMessages.wrongAnswerMessage();
        guesses.add(answer);
        textMessages.printGuesses(guesses);
        textMessages.printCurrentState(currentState);
        drawings.printDrawing(status);
    }

    private void rightAnswer(char answer) {
        for (int i = 0; i < currentState.length; i++) {
            if (enigma[i] == answer) {
                currentState[i] = answer;
            }
        }
        textMessages.rightAnswerMessage();
        guesses.add(answer);
        textMessages.printGuesses(guesses);
        textMessages.printCurrentState(currentState);
        drawings.printDrawing(status);
    }

    private void youWon() throws IOException {
        textMessages.youWonMessage();
        guesses.clear();
        gameOn();
    }

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
