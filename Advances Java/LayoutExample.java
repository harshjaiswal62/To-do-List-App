import java.awt.*;

public class LayoutExample {
    LayoutExample(){
        Frame f1=new Frame("LayoutExample");
        Button b1=new Button("NORTH");
        Button b2=new Button("SOUTH");
        Button b3=new Button("EAST");
        Button b4=new Button("WEST");
        Button b5=new Button("CENTER");
        f1.add(b1,BorderLayout.NORTH);
        f1.add(b2,BorderLayout.SOUTH);
        f1.add(b3,BorderLayout.EAST);
        f1.add(b4,BorderLayout.WEST);
        f1.add(b5,BorderLayout.CENTER);
        f1.setVisible(true);
        f1.setSize(500,500);
    }
    public static void main(String[] args){
        new LayoutExample();

    }
    
}
