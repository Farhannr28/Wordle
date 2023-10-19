package src;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Frame extends JFrame{
    static Color backgroundColor = new Color(20,20,20);
    static Color keyBorder = new Color(110,110,110);
    static Color Darker = new Color(40,40,40);

    static JButton[] keys = new JButton[28];

    static JPanel keyboard1, keyboard2, keyboard3, keyboardE, keyboardB;
    static JPanel boxesPanel;

    Frame(){
        JLabel label = new JLabel();
        label.setText("Wordle");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 36));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(200, 0, 200, 80);

        keyboard1 = new JPanel();
        keyboard1.setBounds(45, 560, 495, 75);
        keyboard1.setBackground(backgroundColor);
        keyboard1.setLayout(new GridLayout(1, 10, 5, 0));

        keyboard2 = new JPanel();
        keyboard2.setBounds(67, 640, 450, 75);
        keyboard2.setBackground(backgroundColor);
        keyboard2.setLayout(new GridLayout(1, 9, 5, 0));

        keyboard3 = new JPanel();
        keyboard3.setBounds(116, 720, 350, 75);
        keyboard3.setBackground(backgroundColor);
        keyboard3.setLayout(new GridLayout(1, 7, 5, 0));

        keyboardE = new JPanel();
        keyboardE.setBounds(44, 720, 70, 75);
        keyboardE.setBackground(backgroundColor);
        keyboardE.setLayout(new GridLayout(1, 1, 5, 0));

        keyboardB = new JPanel();
        keyboardB.setBounds(468, 720, 70, 75);
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
        for(int i=1; i<27; i++){
            keys[i].setFont(new Font("Arial", Font.PLAIN, 23));
            keys[i].setForeground(Color.WHITE);
            keys[i].setBackground(keyBorder);
            keys[i].setFocusable(false);
            keys[i].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
        }
        keys[27].setFont(new Font("Arial", Font.PLAIN, 18));
        keys[27].setForeground(Color.WHITE);
        keys[27].setBackground(keyBorder);
        keys[27].setFocusable(false);
        keys[27].setBorder(BorderFactory.createLineBorder(keyBorder, 4));

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
        boxesPanel.setBounds(95, 75, 400, 450);
        boxesPanel.setBackground(backgroundColor);
        boxesPanel.setLayout(null);
        boxesPanel.setLayout(new GridLayout(6, 5, 6, 5));

        this.setTitle("Wordle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 850);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(backgroundColor); 
        this.add(label);
        this.add(keyboard1);
        this.add(keyboard2);
        this.add(keyboard3);
        this.add(keyboardE);
        this.add(keyboardB);
        this.add(boxesPanel);
        this.setVisible(true);
    }
    
    public void init(){ //every gamestart, reset colors of keys
        keys[0].setBackground(keyBorder);
        keys[0].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
        for(int i=1; i<27; i++){
            keys[i].setBackground(keyBorder);
            keys[i].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
        }
        keys[27].setBackground(keyBorder);
        keys[27].setBorder(BorderFactory.createLineBorder(keyBorder, 4));
    }
}
