import java.io.*;

public class IO4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C://Users/Hp/Desktop/abc.txt.txt");
            FileWriter fw = new FileWriter("C://Users/Hp/Desktop/g.txt.txt");
            PrintWriter pw = new PrintWriter(fw); 
            pw.(fr);
            pw.close();
            fw.close();
            fr.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
    

