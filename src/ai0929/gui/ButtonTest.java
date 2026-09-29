package ai0929.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends JFrame {
    public ButtonTest() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSizeDim = toolkit.getScreenSize();

        int sw = screenSizeDim.width;
        int sh = screenSizeDim.height;

        setLayout(new FlowLayout());
        setTitle("Button 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("메세지 대화 상자 보이기");
        add(btn);

        btn.addActionListener(new ButtonActionListener());

        setSize(500, 200);
        setLocation((sw-500)/2, (sh-200)/2);
        setVisible(true);
    }

    public class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "대화 상자를 선택하셨네요.");
        }
    }

    public static void main(String[] args) {
        new ButtonTest();
    }
}
