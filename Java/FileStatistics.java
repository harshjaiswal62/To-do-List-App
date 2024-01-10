import javax.swing.*;  
import javax.swing.tree.*;  
class FileStatistics 
{
    public static void main(String a[]) 
   { 
    JFrame f=new JFrame();   
    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font"); 
   DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");   
    style.add(color);  
    style.add(font);  
    color.add(red); 
    //create the tree by passing in the root node
    JTree jt=new JTree(style); 
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
    }
}
