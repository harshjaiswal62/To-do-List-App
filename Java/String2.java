//Java Learning am I
public class String2{
    public static void main(String args[]){
        String s1="I am Learning Java";
        String s[]=s1.split(" ");
        String res="";
        for(int i=s.length-1;i>=0;i--)
        {
            res=res+s[i]+" ";
        }
        System.out.print(res);
    }
}
