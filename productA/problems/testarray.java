import java.util.*;
class t
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
int count=0;
for(int a:arr)
{
    if(arr[0]==a)
    {
        count++;
    }
}
System.out.print(arr.length-count);
}
}
