import java.awt.*;
public class ButtonExample{
    ButtonExample(){
        Frame f1 = new Frame("Button Example");
        Button b1 = new Button("Click Me");
        f1.add(b1);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
        b1.setBounds(20,60,80,40);
    }
    public static void main(String[] args){
        ButtonExample be = new ButtonExample();
    }
}
