import java.io.*;

public class IO2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Hp\\Desktop\\abc.txt.txt"));
            bw.write(100);
            bw.newLine();
            char[] ch = {'a','b','c','d'};
            bw.write(ch);
            bw.write("Gla university");
            bw.newLine();
            bw.flush();
            bw.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
