package src;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.Point;
import javax.swing.SwingUtilities;

public class Box implements Runnable{
    JButton button;
    char status; //color of this box status, green/yellow/dark/background (g/y/d/b)
    String letter; //letter contained in this block (# for empty)
    int row;
    int col;

    Box(int r, int c){
        this.row = r;
        this.col = c;
        this.button = new JButton();
        this.button.setFont(new Font("Arial", Font.BOLD, 30));
        this.button.setForeground(Color.WHITE);
        this.button.setText("");
        this.button.setBackground(Frame.backgroundColor);
        this.button.setFocusable(false);
        this.button.setBorder(BorderFactory.createLineBorder(Frame.Darker, 4));
        this.button.setContentAreaFilled(false);
        //this.button.setContentAreaFilled(true);
        Frame.boxesPanel.add(this.button);
    }

    public static void init(){ //every gamestart, reset colors of boxes
        for(int i=0; i<6; i++){
            for (int j=0; j<5; j++){
                Wordle.guessBoxes[i][j].button.setBackground(Frame.backgroundColor);
                Wordle.guessBoxes[i][j].button.setBorder(BorderFactory.createLineBorder(Frame.Darker, 4));
                Wordle.guessBoxes[i][j].button.setText(" ");
                Wordle.guessBoxes[i][j].letter = " ";
            }
        }
    }

    public void updateLetter(){
        this.button.setText(this.letter);
        this.button.setForeground(Color.WHITE);
    }

    public static void reveal(int row){
        Timer timer = new Timer(250, new ActionListener() {
            int c = 0;
            @Override
            public void actionPerformed(ActionEvent e){
                if (c < 5){
                    Wordle.guessBoxes[row][c].button.setContentAreaFilled(true);
                    if (Wordle.status[c] == 'g'){
                        Wordle.guessBoxes[row][c].button.setBackground(Frame.Green);
                        Wordle.guessBoxes[row][c].button.setBorder(BorderFactory.createLineBorder(Frame.Green));
                    } else if (Wordle.status[c] == 'y'){
                        Wordle.guessBoxes[row][c].button.setBackground(Frame.Yellow);
                        Wordle.guessBoxes[row][c].button.setBorder(BorderFactory.createLineBorder(Frame.Yellow));
                    } else {
                        Wordle.guessBoxes[row][c].button.setBackground(Frame.Darker);
                        Wordle.guessBoxes[row][c].button.setBorder(BorderFactory.createLineBorder(Frame.Darker));
                    }
                    c++;
                } else {
                    ((Timer) e.getSource()).stop();
                    return;
                }
            }
        });
        timer.start();
    }

    @Override
    public void run(){

    }

    public void shakeButton() {
        final Point point = this.button.getLocation();
        final int delay = 30;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    button.setLocation(new Point(point.x + 1, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x - 1, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x + 3, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x - 3, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x + 4, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x - 4, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x + 3, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x - 3, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x + 1, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                    button.setLocation(new Point(point.x - 1, point.y));
                    Thread.sleep(delay);
                    button.setLocation(point);
                    Thread.sleep(delay);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}