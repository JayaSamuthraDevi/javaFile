import java.util.Scanner;

class coin
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sub(arr,n);
        
       max(arr,n);
    }
    static void sub(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]-1;
        }
    }
    static void max(int arr[],int n)
    {
        int max=0,maxi=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int a:arr)
        {
            if((a>maxi)&&(a<max))
            {
                maxi=a;
            }
        }
        System.out.print(max+" "+maxi);
    }
}
