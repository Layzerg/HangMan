import java.io.*;
import java.util.*;



public class Main { 
    public static void main(String[] args) {
        System.out.println("Welcome to hanger game!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String textRed = LordOfTheRings.text.replaceAll("\\n", " ").toLowerCase();
        String[] arr = textRed.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i].replaceAll("\\p{P}", "");
            if (s.length() > 4 && !words.contains(s) && Character.isAlphabetic(s.charAt(1))) {
                words.add(s);
            }
        }
        boolean game = false;
        while (true) {
            status = 0;
            guesses.clear();
            game=false;
            gameLoop();
            preparing();

            while (!game) {
                String guess = userInput();                     //ввод пользователя
                while("".equals(guess)||guess==null||Character.isWhitespace(guess.charAt(0))){
                    System.out.println("Don't be shy... ");
                    guess=userInput();
                }
                charFlag = false;
                char ans = checkForError(guess);                    //проверки ввода пользователя
                if(charFlag) {
                     guesses.add(ans);                                   //добавляем в лист попыток

                boolean flag = false;
                for (int i = 0; i < enigma.length; i++) {
                    if (enigma[i] == ans) {
                        flag = true;
                        for (int j = 0; j < enigma.length; j++) {
                            if (enigma[j] == ans) {
                                currentState[j] = ans;                 //если отгдадал, то меняем "_" на отгаданные буквы
                            }
                        }
                        break;
                    }
                }
                if (flag) {

                    if (Arrays.equals(enigma, currentState)) {
                        System.out.println("You won! Have a nice day");         //победа
                        status = 0;
                        game = true;
                    }
                     printDrawing();
                    for (int j = 0; j < enigma.length; j++) {
                        System.out.print(currentState[j] + " ");
                    }
                    System.out.println();
                    System.out.println("That's right!");                    //отгадал
                    System.out.print("Your attempts: ");
                    System.out.print(guesses.toString());
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                } else {
                    status++;
                    printDrawing();
                    if (status == Drawings.drawings.length - 1) {
                        System.out.println("Game over!");                            //проиграл

                        break;
                    }
                    for (int j = 0; j < enigma.length; j++) {
                        System.out.print(currentState[j] + " ");
                    }
                    System.out.println();
                    System.out.println("Nope, that's wrong");                    //не отгадал
                    System.out.println("Choose wisely your next letter...");
                    System.out.print("Your attempts: ");
                    System.out.print(guesses.toString());
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();

                }}
            }
        }
    }
    static boolean charFlag;
    public static char [] currentState;
    public static char[] enigma;
    public  static  ArrayList<String> words = new ArrayList<>();
    public static int status = 0;
    public static ArrayList<Character> guesses = new ArrayList<>();
    public static Random rand  = new Random();
    public static String userInput(){
        String input = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            input = br.readLine().toLowerCase();
        }
        catch(IOException e) {}
        return input;
    }
    public static char checkForError(String s){
        char res=s.charAt(0);
            if (s.length()>1 ){
                charFlag=false;
                System.out.println("You kinda stupid, don't you? Well that's explains your situation. Now you need to choose one letter");
              }
            else if(Character.isDigit(s.charAt(0))){
                charFlag=false;
                System.out.println("Letter not the number... Now you need to choose one letter");
              }
            else if(guesses.contains(res)){
                charFlag=false;
                System.out.println("But that's the same letter...");
             }
            else if("".equals(s)){
            System.out.println("Bruuuuh...");
                    charFlag=false;
                   }
            else if(Character.isAlphabetic(s.charAt(0))){
                res= s.charAt(0);
                charFlag=true;
                return res;   }
            return res;
        }
        public static boolean gameLoop(){
            while(true){
                System.out.println("Do you want to play?! Type: y/n");
                String s =  userInput();
                if(s.equals("y")){
                    return false;
                }
                else if(s.equals("n")){
                    System.exit(0);
                    return true;
                }
                else {continue;}
            }
        }
        public static void preparing(){

            Random rand = new Random();
            //загадываем слово
            String randomWord = words.get(rand.nextInt(words.size()));

            System.out.println("Time to guess!");
            enigma = randomWord.toCharArray();              //загаданное слово в массив
            currentState = new char[enigma.length];        //массив для игрока

            for (int i = 0; i < enigma.length; i++) {
                currentState[i] = '_';
                System.out.print(currentState[i] + " ");              // заполняем массив для игрока
            }
            System.out.println();

        }
        static void printDrawing(){
            System.out.println();
            System.out.println(Drawings.drawings[status]);
            System.out.println();
        }

    }
