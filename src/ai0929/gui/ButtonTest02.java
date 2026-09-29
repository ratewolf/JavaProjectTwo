package ai0929.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest02 extends JFrame {
    public ButtonTest02() {
        int w = 500;
        int h = 200;

//        Dimension locationDim = CenterFrame.getLocation(w, h);
//        int x = locationDim.width; // 정가운데로 표시되는 x좌표
//        int y = locationDim.height; // 정가운데로 표시되는 y좌표

        int[] location = CenterFrame.getLocation(w, h);
        int x = location[0];
        int y = location[1];

        setLayout(new FlowLayout());
        setTitle("Button 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("메세지 대화 상자 보이기");
        add(btn);

        btn.addActionListener(new ButtonActionListener());

        setSize(w, h);
        setLocation(x, y);
        setVisible(true);
    }

    public class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "대화 상자를 선택하셨네요.");
        }
    }

    public static void main(String[] args) {
        new ButtonTest02();
    }
}
