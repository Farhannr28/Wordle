package src;

import java.util.*;
import java.io.*;

public class WordList {

    private static Scanner sc;
    static int avail;
    static int size = 11790;
    public static int[][] trie = new int[size][26];

    public static void memset(){
        for (int i=0; i<size; i++){
            for (int j=0; j<26; j++){
                trie[i][j] = -1;
            }
        }
    }

    public static void insert(String str){
        int c;
        int node = 0;
        for (int i=0; i<4; i++){
            c = str.charAt(i) - 'a';
            if (trie[node][c] == -1){
                trie[node][c] = avail;
                avail++;
            }
            node = trie[node][c];
        }
        c = str.charAt(4) - 'a';
        trie[node][c] = 0;
    }

    public static boolean search(String str){
        int c;
        int node = 0;
        for (int i=0; i<5; i++){
            c = str.charAt(i) - 'a';
            node = trie[node][c];
            if (node == -1){
                return false;
            }
        }
        if (node == 0){
            return true;
        }
        return false;
    }

    public static void read(){
        String word;
        try{
            sc = new Scanner(new File("res/allowed_words.txt"));
            while (sc.hasNextLine()){
                word = sc.nextLine();
                // System.out.println(word);
                insert(word);
            }
            sc.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    WordList(){
        memset();
        avail = 1;
        read();
    }

    /*
    public static void main(String args[]){
        memset();
        avail = 1;
        read();

        int last = 0;
        for (int i=0; i<size; i++){
            for (int j=0; j<26; j++){
                // System.out.print(trie[i][j] + " ");
                if (trie[i][j] != -1){
                    last = i;
                }
            }
            // System.out.println("\n");
        }
        System.out.println(last);
    }
    */
}