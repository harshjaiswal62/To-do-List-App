import java.util.Scanner;
public class MyClass{ 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:"); 
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n/2;j++)
        {
            arr[j]=arr[j]+arr[n-1-j];
            arr[n-1-j]=arr[j]-arr[n-1-j];
            arr[j]=arr[j]-arr[n-1-j];
            //System.out.println(arr[n-1-j]);  
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
        sc.close();
    }
} 