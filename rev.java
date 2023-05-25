import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(int arr[],int m,int n)
    {
        int j=n;
        int b[]=new int[n];
        int pos=0;
      for(int i=0;i<n;i++)
      {
          if(arr[i]==m)
          {
            pos=i;
          }

      }
      for(int i=pos;i<n;i++)
      {
         b[j-1]=arr[i];
         j=j-1;
      }
      for(int k=0;k<n;k++)
      {
          System.out.print(b[k]);
      }
    }



public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- >0)
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution.reverseArray(arr,b,a);
    }
}
}