package level8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    private static int count = 1;
    private JButton jb;
    private boolean flag = false;
    private int X, Y;
    TicTacToe tto = new TicTacToe();


    public JButton createButton() {

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text;
                if (!flag) {
                    if (count % 2 == 0) text = "0";
                    else text = "X";
                    jb.setText(text);
                    tto.game(getX(), getY(), text);

                    count++;
                    flag = true;
                }
            }
        });
        return jb;
    }


    public MyButton(int i) {

        jb = new JButton();
        this.Y = (i % 3);
        this.X = i / 3;
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }
}







