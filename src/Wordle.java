package src;

/* MAIN CLASS */
public class Wordle{

    static Frame frame;
    public static Box[][] guessBoxes = new Box[6][5]; //0-Indexing
    public static String input;
    public static String word; // Allowed words
    public static int guessNum; // 0-Indexing
    public static int round; // 0-Indexing
    public static WordList wordList;
    public static RandomNumberGenerator rng;
    public static AnswerList anslist;
    public static String answer;

    Wordle(){ // Set up every Game Launch
        wordList = new WordList();
        rng = new RandomNumberGenerator();
        anslist = new AnswerList();
        frame = new Frame();
        for(int i=0; i<6; i++){
            for (int j=0; j<5; j++){
                guessBoxes[i][j] = new Box(i,j);
            }
        }
        round = -1;
    }

    public void gameStart(){ //Start of every wordle round
        frame.init();
        Box.init();
        round++;
        answer = anslist.list[round];
        guessNum = 0;
        input = "";
    }

    public static void main(String args[]){
        Wordle game = new Wordle();
        game.gameStart();
    }
}