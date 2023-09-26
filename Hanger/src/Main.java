import java.io.*;
import java.util.*;



public class Main { 
    public static void main(String[] args) {
        System.out.println("Welcome to hanger game!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String text = "When Mr. Bilbo Baggins of Bag End announced that he would shortly\n" +
                "be celebrating his eleventy-first birthday with a party of special magnificence, there was much talk and excitement in Hobbiton.\n" +
                "Bilbo was very rich and very peculiar, and had been the wonder\n" +
                "of the Shire for sixty years, ever since his remarkable disappearance\n" +
                "and unexpected return. The riches he had brought back from his\n" +
                "travels had now become a local legend, and it was popularly believed,\n" +
                "whatever the old folk might say, that the Hill at Bag End was full of\n" +
                "tunnels stuffed with treasure. And if that was not enough for fame,\n" +
                "there was also his prolonged vigour to marvel at. Time wore on, but it\n" +
                "seemed to have little effect on Mr. Baggins. At ninety he was much the\n" +
                "same as at fifty. At ninety-nine they began to call him well-preserved; but\n" +
                "unchanged would have been nearer the mark. There were some that\n" +
                "shook their heads and thought this was too much of a good thing; it\n" +
                "seemed unfair that anyone should possess (apparently) perpetual\n" +
                "youth as well as (reputedly) inexhaustible wealth.\n" +
                "‘It will have to be paid for,’ they said. ‘It isn’t natural, and trouble\n" +
                "will come of it!’\n" +
                "But so far trouble had not come; and as Mr. Baggins was generous\n" +
                "with his money, most people were willing to forgive him his oddities\n" +
                "and his good fortune. He remained on visiting terms with his relatives\n" +
                "(except, of course, the Sackville-Bagginses), and he had many devoted admirers among the hobbits of poor and unimportant families.\n" +
                "But he had no close friends, until some of his younger cousins began\n" +
                "to grow up.\n" +
                "The eldest of these, and Bilbo’s favourite, was young Frodo\n" +
                "Baggins. When Bilbo was ninety-nine he adopted Frodo as his heir,\n" +
                "and brought him to live at Bag End; and the hopes of the SackvilleBagginses were finally dashed. Bilbo and Frodo happened to have\n" +
                "the same birthday, September 22nd. ‘You had better come and live\n" +
                "here, Frodo my lad,’ said Bilbo one day; ‘and then we can celebrate\n" +
                "our birthday-parties comfortably together.’ At that time Frodo was\n" +
                "still in his tweens, as the hobbits called the irresponsible twenties\n" +
                "between childhood and coming of age at thirty-three.\n" +
                "Twelve more years passed. Each year the Bagginses had given\n" +
                "very lively combined birthday-parties at Bag End; but now it was" +
                "understood that something quite exceptional was being planned for\n" +
                "that autumn. Bilbo was going to be eleventy-one, 111, a rather curious\n" +
                "number, and a very respectable age for a hobbit (the Old Took himself\n" +
                "had only reached 130); and Frodo was going to be thirty-three, 33, an\n" +
                "important number: the date of his ‘coming of age’.\n" +
                "Tongues began to wag in Hobbiton and Bywater; and rumour of\n" +
                "the coming event travelled all over the Shire. The history and character of Mr. Bilbo Baggins became once again the chief topic of conversation; and the older folk suddenly found their reminiscences in\n" +
                "welcome demand.\n" +
                "No one had a more attentive audience than old Ham Gamgee,\n" +
                "commonly known as the Gaffer. He held forth at The Ivy Bush, a\n" +
                "small inn on the Bywater road; and he spoke with some authority,\n" +
                "for he had tended the garden at Bag End for forty years, and had\n" +
                "helped old Holman in the same job before that. Now that he was\n" +
                "himself growing old and stiff in the joints, the job was mainly carried\n" +
                "on by his youngest son, Sam Gamgee. Both father and son were on\n" +
                "very friendly terms with Bilbo and Frodo. They lived on the Hill\n" +
                "itself, in Number 3 Bagshot Row just below Bag End.\n" +
                "‘A very nice well-spoken gentlehobbit is Mr. Bilbo, as I’ve always\n" +
                "said,’ the Gaffer declared. With perfect truth: for Bilbo was very\n" +
                "polite to him, calling him ‘Master Hamfast’, and consulting him\n" +
                "constantly upon the growing of vegetables – in the matter of ‘roots’,\n" +
                "especially potatoes, the Gaffer was recognized as the leading authority\n" +
                "by all in the neighbourhood (including himself).\n" +
                "‘But what about this Frodo that lives with him?’ asked Old Noakes\n" +
                "of Bywater. ‘Baggins is his name, but he’s more than half a Brandybuck, they say. It beats me why any Baggins of Hobbiton should go\n" +
                "looking for a wife away there in Buckland, where folks are so queer.’\n" +
                "‘And no wonder they’re queer,’ put in Daddy Twofoot (the\n" +
                "Gaffer’s next-door neighbour), ‘if they live on the wrong side of the\n" +
                "Brandywine River, and right agin the Old Forest. That’s a dark bad\n" +
                "place, if half the tales be true.’\n" +
                "‘You’re right, Dad!’ said the Gaffer. ‘Not that the Brandybucks\n" +
                "of Buckland live in the Old Forest; but they’re a queer breed, seemingly. They fool about with boats on that big river – and that isn’t\n" +
                "natural. Small wonder that trouble came of it, I say. But be that as\n" +
                "it may, Mr. Frodo is as nice a young hobbit as you could wish to\n" +
                "meet. Very much like Mr. Bilbo, and in more than looks. After all\n" +
                "his father was a Baggins. A decent respectable hobbit was Mr. Drogo\n" +
                "Baggins; there was never much to tell of him, till he was drownded.’\n" +
                "‘Drownded?’ said several voices. They had heard this and other\n" +
                "darker rumours before, of course; but hobbits have a passion for\n" +
                "family history, and they were ready to hear it again." +
                "‘Well, so they say,’ said the Gaffer. ‘You see: Mr. Drogo, he\n" +
                "married poor Miss Primula Brandybuck. She was our Mr. Bilbo’s\n" +
                "first cousin on the mother’s side (her mother being the youngest of\n" +
                "the Old Took’s daughters); and Mr. Drogo was his second cousin.\n" +
                "So Mr. Frodo is his first and second cousin, once removed either\n" +
                "way, as the saying is, if you follow me. And Mr. Drogo was staying\n" +
                "at Brandy Hall with his father-in-law, old Master Gorbadoc, as he\n" +
                "often did after his marriage (him being partial to his vittles, and old\n" +
                "Gorbadoc keeping a mighty generous table); and he went out boating\n" +
                "on the Brandywine River; and he and his wife were drownded, and\n" +
                "poor Mr. Frodo only a child and all.’\n" +
                "‘I’ve heard they went on the water after dinner in the moonlight,’\n" +
                "said Old Noakes; ‘and it was Drogo’s weight as sunk the boat.’\n" +
                "‘And I heard she pushed him in, and he pulled her in after him,’\n" +
                "said Sandyman, the Hobbiton miller.\n" +
                "‘You shouldn’t listen to all you hear, Sandyman,’ said the Gaffer,\n" +
                "who did not much like the miller. ‘There isn’t no call to go talking\n" +
                "of pushing and pulling. Boats are quite tricky enough for those that\n" +
                "sit still without looking further for the cause of trouble. Anyway:\n" +
                "there was this Mr. Frodo left an orphan and stranded, as you might\n" +
                "say, among those queer Bucklanders, being brought up anyhow in\n" +
                "Brandy Hall. A regular warren, by all accounts. Old Master Gorbadoc\n" +
                "never had fewer than a couple of hundred relations in the place. Mr.\n" +
                "Bilbo never did a kinder deed than when he brought the lad back to\n" +
                "live among decent folk.\n" +
                "‘But I reckon it was a nasty knock for those Sackville-Bagginses.\n" +
                "They thought they were going to get Bag End, that time when he\n" +
                "went off and was thought to be dead. And then he comes back and\n" +
                "orders them off; and he goes on living and living, and never looking\n" +
                "a day older, bless him! And suddenly he produces an heir, and has\n" +
                "all the papers made out proper. The Sackville-Bagginses won’t never\n" +
                "see the inside of Bag End now, or it is to be hoped not.’\n" +
                "‘There’s a tidy bit of money tucked away up there, I hear tell,’\n" +
                "said a stranger, a visitor on business from Michel Delving in the\n" +
                "Westfarthing. ‘All the top of your hill is full of tunnels packed with\n" +
                "chests of gold and silver, and jools, by what I’ve heard.’\n" +
                "‘Then you’ve heard more than I can speak to,’ answered the\n" +
                "Gaffer. ‘I know nothing about jools. Mr. Bilbo is free with his money,\n" +
                "and there seems no lack of it; but I know of no tunnel-making. I saw\n" +
                "Mr. Bilbo when he came back, a matter of sixty years ago, when I\n" +
                "was a lad. I’d not long come prentice to old Holman (him being my\n" +
                "dad’s cousin), but he had me up at Bag End helping him to keep\n" +
                "folks from trampling and trapessing all over the garden while the sale\n" +
                "was on";
        String Galgenmännchen =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /       \n" +
                        "| |/         \n" +
                        "| |         \n" +
                        "| |          \n" +
                        "| |       \n" +
                        "| |        \n" +
                        "| |      \n" +
                        "| |     \n" +
                        "| |     \n" +
                        "| |        \n" +
                        "| |         \n" +
                        "| |       \n" +
                        "| |         \n" +
                        "| |       \n" +
                        "\"\"\"\"\"\"\"\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  \n" +
                        ". .          `'       . .";
        ;

        String head =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |       \n" +
                        "| |      \n" +
                        "| |     \n" +
                        "| |    \n" +
                        "| |        \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |         \n" +
                        "| |         \n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  \n" +
                        ". .          `'       . .";
        String rightArm =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |           . . Y\\\n" +
                        "| |          |   | \\\\\n" +
                        "| |          | . |  \\\\\n" +
                        "| |          |   |   (`\n" +
                        "| |         \n" +
                        "| |         \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |        \n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  \n" +
                        ". .          `'       . .";
        String leftArm =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |        /Y . . Y\\\n" +
                        "| |       // |   | \\\\\n" +
                        "| |      //  | . |  \\\\\n" +
                        "| |     ')   |   |   (`\n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |         \n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  \n" +
                        ". .          `'       . .";
        String leftLeg =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |        /Y . . Y\\\n" +
                        "| |       // |   | \\\\\n" +
                        "| |      //  | . |  \\\\\n" +
                        "| |     ')   |   |   (`\n" +
                        "| |          ||\n" +
                        "| |          || \n" +
                        "| |          || \n" +
                        "| |          || \n" +
                        "| |         / |  \n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  \n" +
                        ". .          `'       . .";

        String body =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |           . .  \n" +
                        "| |          |   | \n" +
                        "| |          | . |  \n" +
                        "| |          |   |     \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |          \n" +
                        "| |         \n" +
                        "\"\"\"\"\"\"\"\"\"\"|\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  \n" +
                        ". .          `'       . .";
        String hanged =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |        /Y . . Y\\\n" +
                        "| |       // |   | \\\\\n" +
                        "| |      //  | . |  \\\\\n" +
                        "| |     ')   |   |   (`\n" +
                        "| |          ||'||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |         / | | \\\n" +
                        "\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\ ||\n" +
                        "| |        \\ \\        ||\n" +
                        ": :         \\ \\       ::  \n" +
                        ". .          `'       . .";
        String dead =
                " ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  X/X|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |        / Y. .Y\\\n" +
                        "| |        //|   |\\\\\n" +
                        "| |        //| . |\\\\\n" +
                        "| |        ')|   |(`\n" +
                        "| |          ||'||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |         / | | \\ \n" +
                        "\"\"\"\"\"\" \"\"\"|_`-' `-' |\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\ '\"||\n" +
                        "| |        \\ \\           ||\n" +
                        ": :         \\ \\          ::  \n" +
                        ". .                       . .";

        String[] drawings = new String[]{Galgenmännchen, head, body, rightArm, leftArm, leftLeg, hanged, dead};
        String textRed = text.replaceAll("\\n", " ").toLowerCase();
        String[] arr = textRed.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i].replaceAll("\\p{P}", "");
            if (s.length() > 4 && !words.contains(s) && Character.isAlphabetic(s.charAt(1))) {
                words.add(s);
            }
        }
        boolean game = false;


        while (true) {
            guesses.clear();
            game=false;
            gameLoop();
            preparing();

            while (!game) {
                String guess = userInput();                     //ввод пользователя
                while(Character.isWhitespace(guess.charAt(0))||"".equals(guess)){
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
                    } else {
                        flag = false;
                    }
                }
                if (flag == true) {

                    if (Arrays.equals(enigma, currentState)) {
                        System.out.println("You won! Have a nice day");         //победа
                        status = 0;
                        game = true;
  //                      game=gameLoop();
                    }
     //               else{System.out.println("Choose wisely your next letter...");}

                    System.out.println();
                    System.out.println(drawings[status]);
                    System.out.println();
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
                    System.out.println(drawings[status]);
                    if (status == drawings.length - 1) {
                        System.out.println("Game over!");                            //проиграл
                        status = 0;
                        game = true;
                        break;
  //                      game=gameLoop();
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
                return res;
                            }
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

    }
