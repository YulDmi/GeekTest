package level8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JFrame {

    public MyPanel(String text) {
        super("Крестики -  нолики !!!!");
        setSize(400, 100);
       // setLocationRelativeTo(null);
         setLocation(400, 500);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        JLabel jLabel = new JLabel(text);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton jButton = new JButton("Старт");
        jButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ButtonDrawExample.MyWindow();

            }
        });
        panel.add(jLabel);
        panel.add(Box.createRigidArea(new Dimension(5, 10)));
        panel.add(jButton);
        add(BorderLayout.CENTER, panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyPanel("Начинаем");


    }
}
