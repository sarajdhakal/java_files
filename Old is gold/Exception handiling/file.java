import java.io.*;

public class file {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("D:abc.txt");
            int i = 0;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
            f.close();
            // FileReader fr = new FileReader("D:abc.txt");
            // BufferedReader br = new BufferedReader(fr, 0);
            // String s;
            // while ((s = br.readLine()) != null) {

            // System.out.print(s);
            // }
            // fr.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}