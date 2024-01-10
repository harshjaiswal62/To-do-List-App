import java.io.*;

public class IO1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Hp\\Desktop\\abc.txt.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null) {
                System.out.print(line);
                line = br.readLine();
            }
            fr.close();
            br.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
