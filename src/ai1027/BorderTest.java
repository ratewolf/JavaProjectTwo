package ai1027;

import center.CenterFramebyPoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BorderTest extends JFrame {
    public BorderTest() {
        super("BorderLayout 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 1. BorderLayout의 수평, 수직 간격을 10px로 설정하시오
        setLayout(new BorderLayout(10, 10));

        ArrayList<JButton> buttons = new ArrayList<JButton>();
        String[] locations = {"North", "West", "Center", "East", "South"};

        // 2. 각 버튼을 클릭하면 버튼의 라벨 문자열이 선택되었다는 메세지창을 보이시오.
        for (int i = 0; i < 5; i++) {
            JButton btn = new JButton("버튼" + (i + 1));
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton eBtn = (JButton)e.getSource();
                    JOptionPane.showMessageDialog(null, eBtn.getText() + "이 선택되었습니다.");
//                    String showText = e.getActionCommand();
//                    JOptionPane.showMessageDialog(null, showText);
                }
            });
            buttons.add(btn);
            add(locations[i], btn);
        }

        int w = 250, h = 250;
        Point point = CenterFramebyPoint.getLocation(w, h);
        setBounds(point.x, point.y, w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderTest();
    }
}
