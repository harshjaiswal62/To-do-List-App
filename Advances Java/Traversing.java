import java.util.*;
public class Traversing {
    public static void main(String[] args){
        LinkedList<Object> l1=new LinkedList<Object>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        ListIterator<Object> it = l1.listIterator();
        System.out.println("forward traversing");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("backward traversing");
        while (it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
}
    

