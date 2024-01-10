import java.awt.*;
public class Gridlay {
    Gridlay(){
        Frame f1=new Frame("GridLayout");
        Button b1=new Button("B1");
        Button b2=new Button("B2");
        Button b3=new Button("B3");
        Button b4=new Button("B4");
        Button b5=new Button("B5");
        Button b6=new Button("B6");
        Button b7=new Button("B7");
        Button b8=new Button("B8");
        Button b9=new Button("B9");
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.setSize(500,500);
        f1.setVisible(true);
        GridLayout gl=new GridLayout(3,3);
        f1.setLayout(gl);
    }
    public static void main(String[] args){
        new Gridlay();
    }
    
}
