import java.awt.*;
public class But {
    But(){
        Frame f=new Frame();
        Button b=new Button("Hii");
        b.setBounds(20,80,80,80);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    
    }

    public static void main(String[] args){
        new But();
        

    }
    
}
