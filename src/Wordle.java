package src;

/* MAIN CLASS */
public class Wordle{

    Box[][] guessBoxes = new Box[7][6]; //1-Indexing

    Wordle(){
        Frame.init();
    }

    public static void main(String args[]){
        Frame frame = new Frame();
        Wordle game = new Wordle();
    }
}