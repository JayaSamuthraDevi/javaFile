import java.util.*;
class t
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
           int c=sc.nextInt();
int arr[][]=new int[r+1][c+1];

for(int i=1;i<=r;i++)
{
    for(int j=1;j<=c;j++)
    {
        arr[i][j]=sc.nextInt();
    }
}


int count=0,max=0,ans=0;
for(int i=1;i<=r;i++)
{
     for(int j=1;j<=c;j++)
    {
        if(arr[i][j]>0)
        {
            count++;
        }

    }
    if(count>max)
    {
         ans=i;
        max=count;
    }

}
System.out.println(ans);
    
    
    }
}