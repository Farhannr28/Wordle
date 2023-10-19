package src;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Box {
    JButton button;
    char status; //color of this box status, green/yellow/grey/black (g/y/n/b)
    char letter; //letter contained in this block (# for empty)
    int row;
    int col;

    Box(int r, int c){
        this.row = r;
        this.col = c;
        this.button = new JButton();
        this.button.setFont(new Font("Arial", Font.PLAIN, 23));
        this.button.setForeground(Color.WHITE);
        this.button.setBackground(Frame.backgroundColor);
        this.button.setFocusable(false);
        this.button.setBorder(BorderFactory.createLineBorder(Frame.Darker, 4));
        this.button.setEnabled(false);
        Frame.boxesPanel.add(this.button);
    }

    public static void init(){ //every gamestart, reset colors of boxes
        for(int i=1; i<=6; i++){
            for (int j=1; j<=5; j++){
                Wordle.guessBoxes[i][j].button.setBackground(Frame.backgroundColor);
                Wordle.guessBoxes[i][j].button.setBorder(BorderFactory.createLineBorder(Frame.Darker, 4));
            }
        }
    }
}