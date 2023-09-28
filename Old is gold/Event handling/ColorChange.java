import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChange extends JFrame implements ActionListener {
    JButton b1, b2;

    ColorChange() {
        setSize(400, 400);
        setTitle("Color change");
        setVisible(true);
        setLayout(null);
        JButton b1 = new JButton("Click Me");

        b1.setBounds(200, 200, 100, 50);
        add(b1);
        b1.addActionListener(this);
        b1.setActionCommand("Color");
        JButton b2 = new JButton("Close");
        add(b2);
        b2.setBounds(100, 100, 100, 50);
        b2.addActionListener(this);
        b2.setActionCommand("Close");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Close") {
            System.exit(0);
        }
        if (e.getActionCommand() == "Color") {
            getContentPane().setBackground(Color.yellow);
        }
    }

    public static void main(String args[]) {
        new ColorChange();
    }
}
