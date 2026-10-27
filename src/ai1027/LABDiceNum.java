package ai1027;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LABDiceNum extends JFrame {
    Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
    public LABDiceNum() {
        Random random = new Random();
        int numRows = random.nextInt(10) + 1;
        int numCols = random.nextInt(10) + 1;

        setLayout(new GridLayout(numRows, numCols, 2, 2));

        for (int i = 0; i < numRows * numCols; i++) {
            int diceNum = random.nextInt(6);
            JButton btn = new JButton(String.valueOf(diceNum + 1));
            btn.setBackground(colors[diceNum]);
            btn.setOpaque(true);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton eBtn = (JButton)e.getSource();
                    JOptionPane.showMessageDialog(null, eBtn.getText() + "이(가) 선택되었습니다.");
                }
            });
            add(btn);
        }

        int w = numCols * 100, h = numRows * 100;
        SetFrame.setFrame(this, "GridLayout 연습", w, h);
    }

    public static void main(String[] args) {
        new LABDiceNum();
    }
}
