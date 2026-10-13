package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelButtonImageTest extends JFrame {
    ImageIcon lblIcon = new ImageIcon("imgs/dog2.png");
    JLabel lbl = new JLabel();
    boolean flag = false;

    public JLabelButtonImageTest() {
        setTitle("ImageIcon 설정 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon btnIcon = new ImageIcon("imgs/dog_icon.png");
        JButton btn = new JButton("Click Here~", btnIcon);

        btn.addActionListener(btnListener);

        add("North", btn);
        add("Center", lbl);

        int w = 250, h = 250;
        int[] locations = CenterFrame.getLocation(w, h);

        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (lbl.getIcon() == lblIcon) {
//                lbl.setIcon(new ImageIcon());
//            } else {
//                lbl.setIcon(lblIcon);
//            }
//        }
        public void actionPerformed(ActionEvent e) {
            if (flag) {
                lbl.setIcon(new ImageIcon());
                flag = false;
            } else {
                lbl.setIcon(lblIcon);
                flag = true;
            }
        }
    };

    public static void main(String[] args) {
        new JLabelButtonImageTest();
    }
}
