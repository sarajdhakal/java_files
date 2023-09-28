import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VerifyUser extends JFrame implements ActionListener {
    JLabel l1, l2, label1;
    JTextField t1, t2;
    JButton b1;

    VerifyUser() {
        setSize(500, 500);
        setTitle("Verify User");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        label1 = new JLabel("wRONG PERSON");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("verify");
        b1.setActionCommand("verify");
        b1.addActionListener(this);
        l1.setBounds(100, 8, 70, 20);
        l2.setBounds(100, 55, 70, 20);
        t1.setBounds(100, 27, 193, 28);
        t2.setBounds(100, 75, 193, 28);
        b1.setBounds(100, 110, 90, 25);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(label1);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("verify")) {
            String username = t1.getText();
            String password = t2.getText();

            if (username.equals("Admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Logged in successfully!");
                System.out.println(username);
            } else {

                label1.setBounds(100, 200, 70, 20);
                // Clear the fields
                t1.setText("");
                t2.setText("");
            }
        }
    }

    public static void main(String args[]) {
        VerifyUser te1 = new VerifyUser();
    }
}
