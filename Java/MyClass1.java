import java.util.Scanner;
public class MyClass1{ 
    public static void main(String args[]){
        int sum1=0;
        int sum2=0;
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
        for(int j=0;j<n;j++)
        {
            if(arr[j]%2==0)
            {
                sum1=sum1+arr[j];
            }
            else
            {
                sum2=sum2+arr[j];
            }
        }
        System.out.println("Sum of even number array:"+sum1);
        System.out.println("Sum of odd number array:"+sum2);
        sc.close();
    }
} 