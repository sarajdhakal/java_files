
import java.awt.*;

class Samar {
    Frame f;
    Label l1, l2;

    Samar() {
        f.setSize(500, 500);
        f.setTitle("HEllO");
        Button b = new Button("SUBMIT");
        l1 = new Label("NAME");
        l2 = new Label("ROLL NO");
        TextField t1, t2;
        t1 = new TextField("Username");
        t2 = new TextField("ROLL NO");
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setVisible(true);
        l2.setBounds(0, 40, 200, 200);
        t1.setBounds(0, 30, 200, 200);
        t2.setBounds(0, 90, 200, 200);
        b.setBounds(0, 20, 200, 200);
        l1.setBounds(0, 50, 200, 200);

    }

    public static void main(String[] args) {
        Samar a1 = new Samar();
    }
}
