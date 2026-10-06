package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonTest02 extends JFrame {
    public RadioButtonTest02() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("라디오버튼 테스트");

        JPanel panNorth = new JPanel();
        String[] entertainers = {"에스파", "아이브", "리센느"};
        JRadioButton[] radioButtons = new JRadioButton[entertainers.length];
        ImageIcon[] imageIcons = new ImageIcon[entertainers.length];
        JLabel label = new JLabel();

        for (int i = 0; i < entertainers.length; i++) {
            imageIcons[i] = new ImageIcon("imgs/img" + i + ".jpg");
        }

        ButtonGroup group = new ButtonGroup();

        for (int i = 0; i < entertainers.length; i++) {
            radioButtons[i] = new JRadioButton(entertainers[i]);

            int index = i;
            radioButtons[i].addActionListener(e ->
                    label.setIcon(imageIcons[index])
            );

            group.add(radioButtons[i]);
            panNorth.add(radioButtons[i]);
        }

        radioButtons[0].setSelected(true);
        label.setIcon(imageIcons[0]);
        add("North", panNorth);
        add("Center", label);

        int w = 500, h = 500;
        int[] location = CenterFrame.getLocation(w, h);
        setBounds(location[0], location[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonTest02();
    }
}
