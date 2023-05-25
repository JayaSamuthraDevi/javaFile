import java.util.*;
class s
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int i;
int arr[]=new int[n];
for( i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
for(i=0;i<n-2;i++)
{
    for(int j=0;j<n;j++)
    {
if(arr[i]+arr[j]==2020)
{
  System.out.println(arr[i]+"+"+arr[j]+"="+arr[i]+arr[j]);  
System.out.println("total expense ="+arr[i]*arr[j]);
}
}
}
}
}