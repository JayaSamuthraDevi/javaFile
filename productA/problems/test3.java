import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i,j,k;
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int count=0;
    for( j=0;j<n;j++)
    {
        if(arr[j]!=1)
        {
            arr[j]=1;
            for(k=j+1;k<n;k++)
            {
                if(arr[k]==0)
                {
                    arr[k]=1;
                }
                else
                {
                    arr[k]=0;
                }
                
            }
            count++;
        }
        
    }
    System.out.print(count);
    }
    
}