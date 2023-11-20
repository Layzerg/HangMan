import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LordOfTheRings {
    private final File file = new File("src/LordOfTheRings.txt");
    private FileReader fileReader = new FileReader(file);
    private BufferedReader br = new BufferedReader(fileReader);
    private StringBuilder sb = new StringBuilder();
    private String text;

    public LordOfTheRings() throws IOException {
    }

    private String readAndAppendText() throws IOException {
        while (br.ready()) {
            sb.append(br.readLine());
            sb.append(" ");
        }
        text = sb.toString();
        return text;
    }

    public ArrayList<String> textPreparing() throws IOException {
        text = readAndAppendText();
        Set<String> set = new HashSet<>();
        String textRed = text.replaceAll("\\n", " ").toLowerCase();
        String[] arr = textRed.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i].replaceAll("\\p{P}", "");
            if (s.length() > 4 && Character.isAlphabetic(s.charAt(1))) {
                set.add(s);
            }
        }
        return new ArrayList<>(set);
    }

}
