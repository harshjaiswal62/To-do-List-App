import java.util.*;
class A{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("Hello");
        al.add(null);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
    }
}