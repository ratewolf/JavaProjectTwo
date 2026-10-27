package ai1027;

import center.CenterFramebyPoint;
import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridTest extends JFrame {
    public GridTest() {
        int numRows = 3;
        int numCols = 4;

        setLayout(new GridLayout(numRows, numCols, 10, 10));

        for (int i = 0; i < numRows * numCols; i++) {
            JButton btn = new JButton("버튼" + (i + 1));
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
        new GridTest();
    }
}
