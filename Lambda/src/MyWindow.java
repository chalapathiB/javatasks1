import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow
{
    public static void main(String[] args) {
        JFrame jf=new JFrame("My window");
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());


    }
}
