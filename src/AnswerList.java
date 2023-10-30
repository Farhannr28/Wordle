package src;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AnswerList {
    private static Scanner sc;
    static String[] list = new String[2309]; // 0-Indexing

    static void read(){
        String word;
        int count = 0;
        try{
            sc = new Scanner(new File("res/possible_words.txt"));
            while (sc.hasNextLine()){
                word = sc.nextLine();
                list[count] = word;
                count++;
            }
            sc.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    static void shuffle(){
        int j;
        String temp;
        for (int i=2308; i>0; i--){
            j = (int) Wordle.rng.generate(i);
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static char[] checkAnswer(String s, String ans){
        char[] ret = new char[5];
        boolean[] checked = new boolean[5];
        for (int i=0; i<5; i++){
            checked[i] = false;
            ret[i] = 'd';
        }
        for (int i=0; i<5; i++){
            if (s.charAt(i) ==  ans.charAt(i)){
                ret[i] = 'g';
                checked[i] = true;
            }
        }
        for (int i=0; i<5; i++){
            if (ret[i] != 'g'){
                for (int j=0; j<5; j++){
                    if ((s.charAt(i) ==  ans.charAt(j)) && (!checked[j])){
                        ret[i] = 'y';
                        checked[j] = true;
                    }
                }
            }
        }
        return ret;
    }

    AnswerList(){
        read();
        shuffle();
    }
}