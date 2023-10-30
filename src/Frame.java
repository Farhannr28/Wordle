package src;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements ActionListener, KeyListener{
    static Color backgroundColor = new Color(20,20,20);
    static Color keyBorder = new Color(120,120,120);
    static Color Darker = new Color(40,40,40);
    static Color Green = new Color(88,149,81);
    static Color Yellow = new Color(180,162,63);
    static Color Red = new Color(149, 88, 81);

    static JButton[] keys = new JButton[28];

    static JPanel keyboard1, keyboard2, keyboard3, keyboardE, keyboardB;
    static JPanel boxesPanel;
    static JPanel messagePanel;
    static JLabel messageLabel;

    Frame(){
        this.addKeyListener(this);
        JLabel titleLabel = new JLabel();
        titleLabel.setText("Wordle");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.CENTER);
        titleLabel.setBounds(200, 0, 200, 80);

        keyboard1 = new JPanel();
        keyboard1.setBounds(45, 600, 495, 75);
        keyboard1.setBackground(backgroundColor);
        keyboard1.setLayout(new GridLayout(1, 10, 5, 0));

        keyboard2 = new JPanel();
        keyboard2.setBounds(67, 680, 450, 75);
        keyboard2.setBackground(backgroundColor);
        keyboard2.setLayout(new GridLayout(1, 9, 5, 0));

        keyboard3 = new JPanel();
        keyboard3.setBounds(116, 760, 350, 75);
        keyboard3.setBackground(backgroundColor);
        keyboard3.setLayout(new GridLayout(1, 7, 5, 0));

        keyboardE = new JPanel();
        keyboardE.setBounds(44, 760, 70, 75);
        keyboardE.setBackground(backgroundColor);
        keyboardE.setLayout(new GridLayout(1, 1, 5, 0));

        keyboardB = new JPanel();
        keyboardB.setBounds(468, 760, 70, 75);
        keyboardB.setBackground(backgroundColor);
        keyboardB.setLayout(new GridLayout(1, 7, 5, 0));

        JButton A_button = new JButton("A");
        JButton B_button = new JButton("B");
        JButton C_button = new JButton("C");
        JButton D_button = new JButton("D");
        JButton E_button = new JButton("E");
        JButton F_button = new JButton("F");
        JButton G_button = new JButton("G");
        JButton H_button = new JButton("H");
        JButton I_button = new JButton("I");
        JButton J_button = new JButton("J");
        JButton K_button = new JButton("K");
        JButton L_button = new JButton("L");
        JButton M_button = new JButton("M");
        JButton N_button = new JButton("N");
        JButton O_button = new JButton("O");
        JButton P_button = new JButton("P");
        JButton Q_button = new JButton("Q");
        JButton R_button = new JButton("R");
        JButton S_button = new JButton("S");
        JButton T_button = new JButton("T");
        JButton U_button = new JButton("U");
        JButton V_button = new JButton("V");
        JButton W_button = new JButton("W");
        JButton X_button = new JButton("X");
        JButton Y_button = new JButton("Y");
        JButton Z_button = new JButton("Z");
        JButton Enter = new JButton("Enter");
        JButton Backspace = new JButton("<<<");

        keys[0] = Backspace; 
        keys[1] = A_button;
        keys[2] = B_button;
        keys[3] = C_button;
        keys[4] = D_button; 
        keys[5] = E_button;
        keys[6] = F_button;
        keys[7] = G_button;
        keys[8] = H_button; 
        keys[9] = I_button; 
        keys[10] = J_button;  
        keys[11] = K_button; 
        keys[12] = L_button; 
        keys[13] = M_button;
        keys[14] = N_button;
        keys[15] = O_button;
        keys[16] = P_button;
        keys[17] = Q_button;
        keys[18] = R_button;
        keys[19] = S_button;
        keys[20] = T_button;
        keys[21] = U_button;
        keys[22] = V_button;
        keys[23] = W_button;
        keys[24] = X_button; 
        keys[25] = Y_button;
        keys[26] = Z_button;
        keys[27] = Enter;

        keys[0].setFont(new Font("Arial", Font.PLAIN, 18));
        keys[0].setForeground(Color.WHITE);
        keys[0].setBackground(keyBorder);
        keys[0].setFocusable(false);
        keys[0].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
        keys[0].addActionListener(this);
        for(int i=1; i<27; i++){
            keys[i].setFont(new Font("Arial", Font.PLAIN, 23));
            keys[i].setForeground(Color.WHITE);
            keys[i].setBackground(keyBorder);
            keys[i].setFocusable(false);
            keys[i].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
            keys[i].addActionListener(this);
        }
        keys[27].setFont(new Font("Arial", Font.PLAIN, 18));
        keys[27].setForeground(Color.WHITE);
        keys[27].setBackground(keyBorder);
        keys[27].setFocusable(false);
        keys[27].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
        keys[27].addActionListener(this);

        keyboard1.add(keys[17]);
        keyboard1.add(keys[23]);
        keyboard1.add(keys[5]);
        keyboard1.add(keys[18]);
        keyboard1.add(keys[20]);
        keyboard1.add(keys[25]);
        keyboard1.add(keys[21]);
        keyboard1.add(keys[9]);
        keyboard1.add(keys[15]);
        keyboard1.add(keys[16]);
        keyboard2.add(keys[1]);
        keyboard2.add(keys[19]);
        keyboard2.add(keys[4]);
        keyboard2.add(keys[6]);
        keyboard2.add(keys[7]);
        keyboard2.add(keys[8]);
        keyboard2.add(keys[10]);
        keyboard2.add(keys[11]);
        keyboard2.add(keys[12]);
        keyboard3.add(keys[26]);
        keyboard3.add(keys[24]);
        keyboard3.add(keys[3]);
        keyboard3.add(keys[22]);
        keyboard3.add(keys[2]);
        keyboard3.add(keys[14]);
        keyboard3.add(keys[13]);
        keyboardE.add(keys[27]);
        keyboardB.add(keys[0]);

        boxesPanel = new JPanel();
        boxesPanel.setBounds(95, 80, 400, 460);
        boxesPanel.setBackground(backgroundColor);
        boxesPanel.setLayout(null);
        boxesPanel.setLayout(new GridLayout(6, 5, 6, 5));

        JPanel messagePanel = new JPanel();
        messagePanel.setBounds(50, 550, 500, 40);
        messagePanel.setBackground(backgroundColor);

        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setVerticalAlignment(JLabel.CENTER);
        messageLabel.setVisible(false);

        messagePanel.add(messageLabel);

        this.setTitle("Wordle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 900);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(backgroundColor); 
        this.add(titleLabel);
        this.add(keyboard1);
        this.add(keyboard2);
        this.add(keyboard3);
        this.add(keyboardE);
        this.add(keyboardB);
        this.add(boxesPanel);
        this.add(messagePanel);
        this.setVisible(true);
    }

    public void notInListMessage(){
        messageLabel.setText("Not in word list");
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setVisible(true);
        for (int i=0; i<5; i++){
            Wordle.guessBoxes[Wordle.guessNum][i].shakeButton();
        }
        Timer timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                messageLabel.setVisible(false);
            }
        });
        timer.setRepeats(false);
        timer.start();
        return;
    }

    public void notEnoughMessage(){
        messageLabel.setText("Not enough letters");
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setVisible(true);
        for (int i=0; i<5; i++){
            Wordle.guessBoxes[Wordle.guessNum][i].shakeButton();
        }
        Timer timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                messageLabel.setVisible(false);
            }
        });
        timer.setRepeats(false);
        timer.start();
        return;
    }

    public static void winMessage(){
        messageLabel.setForeground(Color.WHITE);
        switch(Wordle.guessNum){
            case 0:
                messageLabel.setText("Genius!");
                break;
            case 1:
                messageLabel.setText("Magnificent!");
                break;
            case 2:
                messageLabel.setText("Impressive!");
                break;
            case 3:
                messageLabel.setText("Splendid!");
                break;
            case 4:
                messageLabel.setText("Great!");
                break;
            case 5:
                messageLabel.setText("Phew!");
                break;
        }
        messageLabel.setVisible(true);
        Timer timer = new Timer(3250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
                messageLabel.setForeground(keyBorder);
                messageLabel.setText("Press the spacebar to play again");
            }
        });
        timer.setRepeats(false);
        timer.start();
        return;
    }

    public static void revealAnswer(){
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setText("The answer is " + Wordle.answer);
        messageLabel.setVisible(true);
        Timer timer = new Timer(3250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
                messageLabel.setForeground(keyBorder);
                messageLabel.setText("Press the spacebar to play again");
            }
        });
        timer.setRepeats(false);
        timer.start();
        return;
    }

    public static void keyUpdate(){
        Timer timer = new Timer(250, new ActionListener(){
            int idx;
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e){
                if (i < 5){
                    idx = (Wordle.input.charAt(i) - 'a') + 1;
                    if (Wordle.status[i] == 'd' && keys[idx].getBackground() == keyBorder){
                        keys[idx].setBackground(Darker);
                        keys[idx].setBorder(BorderFactory.createLineBorder(Darker));
                        keys[idx].setEnabled(false);
                    } else if (Wordle.status[i] == 'y' && keys[idx].getBackground() == keyBorder){
                        keys[idx].setBackground(Yellow);
                        keys[idx].setBorder(BorderFactory.createLineBorder(Yellow));
                    } else if (Wordle.status[i] == 'g' && keys[idx].getBackground() == keyBorder){
                        keys[idx].setBackground(Green);
                        keys[idx].setBorder(BorderFactory.createLineBorder(Green));
                    }
                    i++;
                } else {
                    Wordle.input = "";
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    public void init(){ //every gamestart, reset colors of keys and hide label
        messageLabel.setVisible(false);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        keys[0].setBackground(keyBorder);
        keys[0].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
        for(int i=1; i<27; i++){
            keys[i].setBackground(keyBorder);
            keys[i].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
            keys[i].setEnabled(true);
        }
        keys[27].setBackground(keyBorder);
        keys[27].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
    }

    @Override
    public void actionPerformed(ActionEvent e){
        for (int i=1; i<27; i++){
            if (e.getSource() == keys[i]){
                if (Wordle.input.length() < 5){
                    Wordle.input += Character.toString(i + 96);
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].letter = String.valueOf(Wordle.input.charAt(Wordle.input.length()-1));
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].letter = Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].letter.toUpperCase();
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].button.setBorder(BorderFactory.createLineBorder(keyBorder, 4));
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].updateLetter();
                }
            }
        }
        if (e.getSource() == keys[0]){
            if (Wordle.input.length() > 0){
                Wordle.input = Wordle.input.substring(0, Wordle.input.length()-1);
                Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()].letter = String.valueOf(' ');
                Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()].button.setBorder(BorderFactory.createLineBorder(Darker, 4));
                Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()].updateLetter();
            }
        }
        if (e.getSource() == keys[27]){
            if (Wordle.input.length() < 5){
                notEnoughMessage();
            } else {
                if (WordList.search(Wordle.input)){
                    Wordle.guessEntered();
                } else {
                    notInListMessage();
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e){}

    @Override
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode()==8){
            if (Wordle.input.length() > 0){
                Wordle.input = Wordle.input.substring(0, Wordle.input.length()-1);
                Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()].letter = String.valueOf(' ');
                Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()].button.setBorder(BorderFactory.createLineBorder(Darker, 4));
                Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()].updateLetter();
            }
        } else if (e.getKeyCode()==10) {
            if (Wordle.input.length() < 5){
                notEnoughMessage();
            } else {
                if (WordList.search(Wordle.input)){
                    Wordle.guessEntered();
                } else {
                    notInListMessage();
                }
            }
        } else if (e.getKeyCode()==32) {
            if (Wordle.over){
                Wordle.gameStart();
            }
        } else {
            if (65 <= e.getKeyCode() && e.getKeyCode() <= 90){
                if (Wordle.input.length() < 5){
                    Wordle.input += (char) (e.getKeyCode()+32);
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].letter = String.valueOf(Wordle.input.charAt(Wordle.input.length()-1));
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].letter = Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].letter.toUpperCase();
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].button.setBorder(BorderFactory.createLineBorder(keyBorder, 4));
                    Wordle.guessBoxes[Wordle.guessNum][Wordle.input.length()-1].updateLetter();
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e){}
}