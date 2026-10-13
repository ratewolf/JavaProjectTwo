package ai1013;

import center.CenterFramebyPoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlowLayoutTest extends JFrame {
    Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.black, Color.WHITE};

    public FlowLayoutTest() {
        setTitle("JList와 JComboBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 15));

        ArrayList<JButton> buttons = new ArrayList<JButton>(5);

        for (int i = 0; i < 5; i++) {
            JButton btn = new JButton("버튼" + (i + 1));
            btn.setOpaque(true);
            btn.setBackground(null);
            int finalI = i;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton selectedButton = (JButton) e.getSource();

                    if (selectedButton.isBackgroundSet()) {
                        selectedButton.setBackground(null);
                    }
                    else {
                        selectedButton.setBackground(colors[finalI]);
                    }
                }
            });
            buttons.add(btn);
            add(btn);
        }

        int w = 250, h = 250;
        Point point = CenterFramebyPoint.getLocation(w, h);
        setBounds(point.x, point.y, w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
