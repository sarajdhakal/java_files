import java.awt.*;
import java.awt.event.*;

class EventHandling1 extends Frame implements ActionListener {
    TextField textField;

    EventHandling1() {
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        Button button = new Button("Show");
        button.setBounds(90, 140, 75, 40);
        button.addActionListener(this);
        add(button);
        add(textField);
        setSize(250, 250);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello World");
    }

    public static void main(String args[]) {
        EventHandling1 event = new EventHandling1();
    }
}