//I ma gninraeL avaJ
public class String3{
    public static void main(String args[]){
        String s1="I am Learning Java";
        String s[]=s1.split(" ");
        String res="";
        for(int i=0;i<s.length;i++)
        {
            StringBuffer str=new StringBuffer(s[i]);
            res=res+str.reverse()+" ";
        }
        System.out.print(res);
    }
}
