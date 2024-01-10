import java.io.*;

public class IO {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C://Users/Hp/Desktop/g.txt.txt");
            FileReader fr = new FileReader("C://Users/Hp/Desktop/abc.txt.txt");
            int data = 1;
            while(data!=-1) {
                data = fr.read();
                char ch = (char)data;
                System.out.print(ch);
                fw.write(ch);
            }
            fr.close();
            fw.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
