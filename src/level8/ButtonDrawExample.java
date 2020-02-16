package level8;

import javax.swing.*;
import java.awt.*;

public class ButtonDrawExample {

    static class MyWindow extends JFrame {
        public MyWindow() {
            setSize(200, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            JButton[] jbs = new JButton[9];
            setLayout(new GridLayout(3, 3));
            for (int i = 0; i < jbs.length; i++) {
                add(new MyButton(i).createButton());
            }
            setVisible(true);

        }
    }
}
