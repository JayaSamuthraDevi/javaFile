import java.util.*;

class l
{
    
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new  int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
       add(arr,n);
        
    }

    static void add(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               int sum= arr[i]+arr[j];
               count+=check(sum,arr,n);
            }
        }
        System.out.print(count);
    }
    static int check(int sum,int arr[],int n)
    {
        
        for(int i=0;i<n;i++)
        {
            if(sum==arr[i])
            {
                return 1;
            }

        }
        return 0;
    }
}
