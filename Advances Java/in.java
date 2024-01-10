public class in {
    void fun(int x){
            if(x>0){
                fun(--x);
                System.out.println(x);
                fun(--x);
            }
        }
    public static void main(String[] args){
        in a= new in();
        a.fun(3);
        
    }
    
}
