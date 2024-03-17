import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class TextEditor implements ActionListener{
    private JFrame fr;
    private JPanel pr;
    private JTextArea txt;
    private JMenuBar mb;
    private JMenu m;
    private JMenuItem mi1, mi2, mi3, mi4;
    
    public TextEditor(){
        fr = new JFrame("My Text Editor");
        txt = new JTextArea();
        mb = new JMenuBar();
        m = new JMenu("File");
        fr.setJMenuBar(mb);
        mb.add(m);
        mi1 = new JMenuItem("New");
        mi1.addActionListener(this);
        mi2 = new JMenuItem("Open");
        mi2.addActionListener(this);
        mi3 = new JMenuItem("Save");
        mi3.addActionListener(this);
        mi4 = new JMenuItem("Exit");
        mi4.addActionListener(this);
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        m.addSeparator();
        m.add(mi4);
  
        fr.add(txt);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,500);
        fr.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(mi1)){
            txt.setText("");
        }
        else if(e.getSource().equals(mi2)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr); // fr คือ ตัวแปรออปเจ็ค JFrame
            File f = fc.getSelectedFile();
            try{
                int ch;
                FileReader fr = new FileReader(f);
                while ((ch=fr.read()) != -1){
                    txt.append((char)ch + "");
                }
                fr.close();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        else if(e.getSource().equals(mi3)){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr); // fr คือ ตัวแปรออปเจ็ค JFrame
            File f = fc.getSelectedFile();
            try{
                FileWriter fw = new FileWriter(f);
                fw.write(txt.getText());
                fw.close();
            }
            catch(IOException ex){
                System.out.print(ex);
            }
        }
        else if(e.getSource().equals(mi4)){
            System.exit(JFrame.EXIT_ON_CLOSE);
        }
    }
}
