package src;

import java.util.Arrays;

/* MAIN CLASS */
public class Wordle{

    static Frame frame;
    public static Box[][] guessBoxes = new Box[6][5]; //0-Indexing
    public static String input;
    public static int guessNum; // 0-Indexing
    public static int round; // 0-Indexing
    public static WordList wordList;
    public static RandomNumberGenerator rng;
    public static AnswerList anslist;
    public static String answer;
    public static char[] status = new char[5];
    public static boolean over;

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

    public static void gameStart(){ //Start of every wordle round
        over = false;
        frame.init();
        Box.init();
        round++;
        answer = anslist.list[round];
        guessNum = 0;
        input = "";
        Arrays.fill(status, 'b');
    }

    public static void guessEntered(){
        Wordle.status = AnswerList.checkAnswer(Wordle.input, Wordle.answer);
        over = true;
        for (int i=0; i<5; i++){
            if (Wordle.status[i] != 'g'){
                over = false;
            }
        }
        Box.reveal(Wordle.guessNum);
        if (over){
            Frame.winMessage();
            return;
        }
        Frame.keyUpdate();
        // Wordle.input = ""; located at Frame.java after the execution of Frame.keyUpdate()
        Wordle.guessNum++;
        if (guessNum == 6){
            over = true;
            Frame.revealAnswer();
            return;
        }
        return;
    }

    public static void main(String args[]){
        Wordle game = new Wordle();
        gameStart();
    }
}