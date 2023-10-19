package src;

/* MAIN CLASS */
public class Wordle{

    static Frame frame;
    public static Box[][] guessBoxes = new Box[7][6]; //1-Indexing

    Wordle(){ // Set up every Game Launch
        WordList wordList = new WordList();
        frame = new Frame();
        for(int i=1; i<=6; i++){
            for (int j=1; j<=5; j++){
                guessBoxes[i][j] = new Box(i,j);
            }
        }
    }

    public void gameStart(){ //Start of every wordle round
        frame.init();
        Box.init();
    }

    public static void main(String args[]){
        Wordle game = new Wordle();
        game.gameStart();
    }
}