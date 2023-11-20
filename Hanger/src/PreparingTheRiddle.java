import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PreparingTheRiddle {

    public char[] currentState;
    public char[] enigma;

    public PreparingTheRiddle(){

    }

    public char [][] preparingGame() throws IOException {
        char [][] arrays = new char[2][];
        LordOfTheRings lordOfTheRings = new LordOfTheRings();
        ArrayList<String> words = lordOfTheRings.textPreparing();
        Random rand = new Random();                                             //загадываем слово
        String randomWord = words.get(rand.nextInt(words.size()));
        enigma = randomWord.toCharArray();                                      //загаданное слово в массив
        currentState = new char[enigma.length];                                  //массив для игрока
        Arrays.fill(currentState, '_');
        arrays[0] = enigma;
        arrays[1] = currentState;
        return arrays;
    }
}
