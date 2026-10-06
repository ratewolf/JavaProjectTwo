package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest01 extends JFrame {
    public CheckBoxTest01() {
        int w = 300;
        int h = 200;

        int[] location = CenterFrame.getLocation(w, h);
        int x = location[0];
        int y = location[1];

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CheckBox 컴포넌트 연습");
        // 레이아웃: 컴포넌트를 보기 좋게 배치
        // JFrame 기본 레이아웃: BorderLayout
        // BorderLayout은 컴포넌트를 동, 서, 남, 북, 가운데 5개의 위치에 배치
        setLayout(new FlowLayout());

        JCheckBox checkBox01 = new JCheckBox("선택하세요");
        checkBox01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox01.isSelected()) {
                    JOptionPane.showMessageDialog(null, "체크박스 ON 이네요");
                }
                else {
                    JOptionPane.showMessageDialog(null, "체크박스 OFF 네요");
                }
            }
        });

        add(checkBox01);

        setSize(w, h);
        setLocation(x, y);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxTest01();
    }
}
