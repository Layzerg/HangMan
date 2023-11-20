import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class UserInput {

    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public UserInput() {

    }

    public char userInput(TreeSet<Character> set) {
        char resInput = '0';
        boolean validInput = false;
        while (!validInput) {
            String input = getUserInput();
            if (!checkInputForError(input, set)) {
                System.out.println("Try again :)");
            } else {
                resInput = input.charAt(0);
                validInput = true;
            }
        }
        return resInput;
    }

    public char userYNInput() {
        char resInput = '0';
        boolean validInput = false;
        while (!validInput) {
            String input = getUserInput();
            if (!checkInputForYN(input)) {
                System.out.println("Try again :)");
            } else {
                resInput = input.charAt(0);
                validInput = true;
            }
        }
        return resInput;
    }

    private boolean checkInputForError(String s, TreeSet<Character> set) {
        if (s.length() == 0) {
            return false;
        }
        char res = s.charAt(0);
        boolean approoved = false;
        if (s.length() > 1) {
            System.out.println("You need to choose one letter");
            return approoved;
        } else if (Character.isDigit(res)) {
            System.out.println("Letter not the number... Now you need to choose one letter");
            return approoved;
        } else if (set.contains(res)) {
            System.out.println("But that's the same letter...");
            return approoved;
        } else if (Character.isAlphabetic(s.charAt(0))) {
            approoved = true;
            return approoved;
        }
        return approoved;
    }

    private boolean checkInputForYN(String s) {
        if (s.length() == 0) {
            System.out.println("There gotta be some input");
            return false;
        }
        char res = s.charAt(0);
        boolean approoved = false;
        if (s.length() > 1) {
            System.out.println("You need to choose one letter, Y or N");
            return approoved;
        } else if (Character.isDigit(res)) {
            System.out.println("Letter not the number... Now you need to choose one letter");
            return approoved;
        } else if (!Character.isAlphabetic(s.charAt(0))) {
            return approoved;
        } else if (res == 'y' || res == 'n') {
            approoved = true;
            return approoved;
        }
        return approoved;
    }

    private String getUserInput() {
        String input = null;
        try {
            input = br.readLine().toLowerCase();
            //         br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return input;
    }
}
