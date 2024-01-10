import java.awt.*;

public class Menu_Bar {
    Menu_Bar(){
        Frame f1=new Frame("MenuExample");
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("File");
        Menu m12=new Menu("Edit");
        MenuItem mi1=new MenuItem("New");
        m1.add(mi1);
        Menu m2=new Menu("Open");
        MenuItem mi2=new MenuItem("PDF");
        m1.add(m2);
        m2.add(mi2);
        MenuItem mi3=new MenuItem("Save");
        m1.add(mi3);
        Menu m3=new Menu("Save As");
        MenuItem mi4=new MenuItem("Desktop");
        MenuItem mi5=new MenuItem("Document");
        m1.add(m3);
        m3.add(mi4);
        m3.add(mi5);
        mb.add(m1);
        mb.add(m12);
        f1.setMenuBar(mb);
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setLayout(null);
    }
    public static void main(String[] args){
        new Menu_Bar();
    }
    
}
