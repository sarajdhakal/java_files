import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class CircleApplication extends JFrame {
    public CircleApplication() {
        setTitle("Circle Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawOval(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        // Create an instance of the application
        CircleApplication application = new CircleApplication();
    }
}
