import java.util.*;
class t{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid=arr.length;
        int val=mid/2;
        int pos=arr[val];
        for(int i=0;i<n;i++)
        {
            int a=arr[i]-pos;
            if(a<0)
            {
                a=a*-1;
            }
            arr[i]=a;
        }
       int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}

//16,1,2,0,4,2,7,1,2,14
