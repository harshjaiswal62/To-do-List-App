import java.awt.*;
import java.awt.event.*;

public class Example implements ActionListener{
    TextField t1,t2,t3;
    Button b;
    Frame f;
    Example(){
        f=new Frame();
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        b=new Button();
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);
        t1.setBounds(20,40,80,30);
        t2.setBounds(20,80,80,30);
        t3.setBounds(20,120,80,30);
        b.setBounds(40,160,80,30);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s=t1.getText();
        int a=Integer.parseInt(s);
        t2.setText(String.valueOf(a-1));
        t3.setText(String.valueOf(a+1));
    }
    public static void main(String[] args){
        new Example();
    }
}
