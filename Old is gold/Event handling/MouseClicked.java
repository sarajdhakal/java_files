import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MouseClicked extends JFrame {
    MouseClicked() {
        setSize(300, 300);
        setTitle("Hello");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                getContentPane().setBackground(Color.red);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        MouseClicked h1 = new MouseClicked();
    }
}
