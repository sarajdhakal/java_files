
import java.awt.*;
public class Samar {
    Samar()
    {
        Frame f;
        f.setSize(300,300);
        f.setTitle("HEllO");
        Button b = new Button("SUBMIT");
        Label l1,l2;
        l1 = new Label("NAME");
        l2 = new Label("ROLL NO");
        TextField t1,t2;
        t1 = new TextField("Username");
        t2 = new TextField("ROLL NO");
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setVisible(True);
        l1.setbounds(0,50,200,200);
        l2.setbounds(0,40,200,200);
        t1.setbounds(0,30,200,200);
        t2.setbounds(0,90,200,200);
        b.setbounds(0,20,200,200);






    }

    public static void main(String[] args) {
        Samar a = new Samar();
    }
}
