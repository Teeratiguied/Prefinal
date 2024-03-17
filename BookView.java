import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class BookView {
    private JFrame fr;
    private JPanel pr1, pr2, pr3, pr4, pr5;
    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2, txt3;
    private JButton b1, b2, b3, b4, b5;
    private JComboBox cb;
    
    public BookView(){
        fr = new JFrame();
        pr1 = new JPanel();
        pr2 = new JPanel();
        pr3 = new JPanel();
        pr4 = new JPanel();
        pr5 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        txt1 = new JTextField();
        txt2= new JTextField();
        txt3 = new JTextField("0");
        cb = new JComboBox();
        
        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        
        
        b1 = new JButton("<<<");
        b2 = new JButton(">>>");
        b3= new JButton("Add");
        b4 = new JButton("Update");
        b5 = new JButton("Delete");
        
        pr1.setLayout(new GridLayout(1, 2));
        pr1.add(lb1);
        pr1.add(txt1);
        
        pr2.setLayout(new GridLayout(1, 2));
        pr2.add(lb2);
        pr2.add(txt2);
        
        pr3.setLayout(new GridLayout(1, 2));
        pr3.add(lb3);
        pr3.add(cb);
        
        pr4.setLayout(new FlowLayout());
        pr4.add(b1);
        txt3.setEditable(false);
        pr4.add(txt3);
        pr4.add(b2);
        
        pr5.setLayout(new FlowLayout());
        pr5.add(b3);
        pr5.add(b4);
        pr5.add(b5);
        
        fr.setLayout(new GridLayout(5,1));
        fr.add(pr1);
        fr.add(pr2);
        fr.add(pr3);
        fr.add(pr4);
        fr.add(pr5  );
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
}
