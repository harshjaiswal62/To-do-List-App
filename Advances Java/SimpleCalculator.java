import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener {
    Frame f1;
    TextField tf1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    int num1,num2,check,sum;
    SimpleCalculator(){
        f1=new Frame("Calculator");
        tf1= new TextField();
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b10=new Button("=");
        b11=new Button("+");
        b12=new Button("-");
        b13=new Button("*");
        b14=new Button("/");
        b15=new Button("%");
        b16=new Button("C");
        b17=new Button("0");
        f1.add(tf1);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.add(b10);
        f1.add(b11);
        f1.add(b12);
        f1.add(b13);
        f1.add(b14);
        f1.add(b15);
        f1.add(b16);
        f1.add(b17);
        f1.setSize(500,500);
        GridLayout gl1= new GridLayout(4,4);
        f1.setLayout(gl1);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String a,b;

        if(e.getSource()==b1){
            a=tf1.getText();
            b=a+"1";
            tf1.setText(b);
        }
        if(e.getSource()==b2){
            a=tf1.getText();
            b=a+"2";
            tf1.setText(b);
        }
        if(e.getSource()==b3){
            a=tf1.getText();
            b=a+"3";
            tf1.setText(b);
        }
        if(e.getSource()==b4){
            a=tf1.getText();
            b=a+"4";
            tf1.setText(b);
        }
        if(e.getSource()==b5){
            a=tf1.getText();
            b=a+"5";
            tf1.setText(b);
        }
        if(e.getSource()==b6){
            a=tf1.getText();
            b=a+"6";
            tf1.setText(b);
        }
        if(e.getSource()==b7){
            a=tf1.getText();
            b=a+"7";
            tf1.setText(b);
        }
        if(e.getSource()==b8){
            a=tf1.getText();
            b=a+"8";
            tf1.setText(b);
        }
        if(e.getSource()==b9){
            a=tf1.getText();
            b=a+"9";
            tf1.setText(b);
        }
        if(e.getSource()==b10){
            num2=Integer.parseInt(tf1.getText());
            if(check==1)
               sum=num1+num2;
               b=Integer.toString(sum);
            if(check==2)
               sum=num1-num2;
               b=Integer.toString(sum);
            if(check==3)
               sum=num1*num2;
               b=Integer.toString(sum);
            tf1.setText(b);
        }
        if(e.getSource()==b11){
            num1=Integer.parseInt(tf1.getText());
            b="";
            tf1.setText(b);
            check=1;
        }
        if(e.getSource()==b12){
            num1=Integer.parseInt(tf1.getText());
            b="";
            tf1.setText(b);
            check=2;
        }
        if(e.getSource()==b13){
            num1=Integer.parseInt(tf1.getText());
            b="";
            tf1.setText(b);
            check=3;
        }
    }
    public static void main(String[] args){
        new SimpleCalculator();
    }
}
