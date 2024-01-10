import java.util.*;

public class Coll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        String s;
        ArrayList<Object> l1 = new ArrayList<Object>();
        ArrayList<String> l2 = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            m = sc.nextInt();
            s = sc.next();
            l1.add(m);
            l2.add(s);
        }
        System.out.println(l1);
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);
        l1.retainAll(l2);
        System.out.println(l1);
        l1.set(n-1, "Java");
        System.out.println(l1);
        sc.close();
    }
}
