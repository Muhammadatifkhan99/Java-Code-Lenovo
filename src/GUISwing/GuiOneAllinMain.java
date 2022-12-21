package GUISwing;

import javax.swing.*;
import java.awt.*;

public class GuiOneAllinMain {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Calculator");
        JButton b1 = new JButton("ok");
        JButton b2 = new JButton("cancel");
        f1.setLayout(new GridLayout(2,1));
        f1.setVisible(true);
        f1.add(b1);
        f1.add(b2);
        //this sets the default size of the window which is being displayed and shown when the program runs
        f1.setBounds(0,0,100,200);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f1.setLayout(null);
//        b2.setBounds(0,100,100,100);
//        b1.setBounds(0,0,100,100);
        //when grid is used we can get ride of the setbounds because gride divides the area into rows
        //and cols and put all the components in the gride................


    }
}
