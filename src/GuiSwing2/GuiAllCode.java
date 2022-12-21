package GuiSwing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAllCode extends JFrame{
    private JButton b1,b2;
    private JTextField t1;

    public GuiAllCode(String caculator){
        this.setLayout(new GridLayout(2,1));
        this.setBounds(0,0,100,200);
        JButton b1 = new JButton("Ok");
        JButton b2 = new JButton("Cancel");
        t1 = new JTextField();
        this.setVisible(true);
        this.add(b1);
        this.add(b2);
        this.add(t1);
        //this sets the default size of the window which is being displayed and shown when the program runs
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //inner classes for Buttons
        class Code1 implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
//                t1.setText("OK button clicked through Inner class");
                System.out.println("Ok button clicked");
            }
        }
        //2nd Inner Class for b2 button text
        class Code2 implements ActionListener{
            public void actionPerformed(ActionEvent e){
//                t1.setText("Cancel button clicked throught 2nd Inner class");
                System.out.println("Ok button clicked");
            }
        }
        //Objects of the Inner classes
        Code1 c1 = new Code1();
        Code2 c2 = new Code2();

        //adding actionlisteners for the buttons
        b1.addActionListener(c1);
//        b2.addActionListener(c2);


        //adding actionlistener throught anonymous classes
        //Anonymous class
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancel button clicked throught anonymous class");
            }
        });
        //Anonymous class
    }
}
