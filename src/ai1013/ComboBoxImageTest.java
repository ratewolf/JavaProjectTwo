package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxImageTest extends JFrame {
    JLabel lbl = new JLabel();
    ImageIcon lblImageIcon = new ImageIcon();

    public ComboBoxImageTest() {
        setTitle("JList와 JComboBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] items = {"강아지", "고양이", "토끼", "미어캣", "코알라"};
        JComboBox comboBox = new JComboBox(items);
        comboBox.addItemListener(comboListener);

        add("North", comboBox);
        add("Center", lbl);

        int w = 250, h = 250;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    ItemListener comboListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String selectedItem = (String) e.getItem();
            switch (selectedItem) {
                case "강아지":
                    lblImageIcon = new ImageIcon("imgs/pets/pet01.png");
                    break;
                case "고양이":
                    lblImageIcon = new ImageIcon("imgs/pets/pet02.png");
                    break;
                case "토끼":
                    lblImageIcon = new ImageIcon("imgs/pets/pet03.png");
                    break;
                case "미어캣":
                    lblImageIcon = new ImageIcon("imgs/pets/pet04.png");
                    break;
                case "코알라":
                    lblImageIcon = new ImageIcon("imgs/pets/pet05.png");
                    break;
            }

            lbl.setIcon(lblImageIcon);
        }
    };

    public static void main(String[] args) {
        new ComboBoxImageTest();
    }
}
