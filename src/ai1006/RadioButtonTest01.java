package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonTest01 extends JFrame {
    ImageIcon[] imageIcons;
    JLabel label;
    JRadioButton[] radioButtons;

    public RadioButtonTest01() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("라디오버튼 테스트");

        JPanel panNorth = new JPanel();
        String[] entertainers = {"에스파", "아이브", "리센느"};
        radioButtons = new JRadioButton[entertainers.length];
        imageIcons = new ImageIcon[entertainers.length];
        label = new JLabel();

        for (int i = 0; i < entertainers.length; i++) {
            radioButtons[i] = new JRadioButton(entertainers[i]);
            radioButtons[i].addItemListener(radioListener);
            panNorth.add(radioButtons[i]);
        }

        for (int i = 0; i < entertainers.length; i++) {
            imageIcons[i] = new ImageIcon("imgs/img" + i + ".jpg");
        }

        label.setIcon(imageIcons[0]);
        add("North", panNorth);
        add("Center", label);

        ButtonGroup group = new ButtonGroup();
        for (int j = 0; j < radioButtons.length; j++) {
            group.add(radioButtons[j]);
        }

        int w = 500, h = 500;
        int[] location = CenterFrame.getLocation(w, h);
        setBounds(location[0], location[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonTest01();
    }

    ItemListener radioListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JRadioButton selectedRadio = (JRadioButton) e.getSource();
            if (selectedRadio == radioButtons[0])
                label.setIcon(imageIcons[0]);
            else if (selectedRadio == radioButtons[1]) {
                label.setIcon(imageIcons[1]);
            }
            else {
                label.setIcon(imageIcons[2]);
            }
        }
    };
}
