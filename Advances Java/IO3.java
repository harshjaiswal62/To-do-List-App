import java.io.*;

public class IO3 {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("C://Users/Hp/Desktop/abc.txt.txt");
            PrintWriter pw = new PrintWriter(fr); 
            pw.write(100);
            pw.println(100);
            pw.println("Java");
            pw.println(58.5);
            pw.println("Welcome in Java World");
            pw.close();
            fr.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
