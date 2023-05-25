import java.util.*;
class rock
{
int arr1[];
int arr2[];
public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
int i,j;
int n=sc.nextInt();
int arr[]=new int[n];

for( i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}

split(arr,n);

}

public static void split(int arr[],int n)
{
    int arr1[]=new int[n/2];
    int arr2[]=new int[n/2];

    for(int i=0;i<n/2;i++)
    {
        arr1[i]=arr[i];
    }

   int i=n/2;
    for(int j=0;j<n/2;j++)
    {
    
        
    
        arr2[j]=arr[i];
       
    i++;
    }
    //mul(arr1,arr2,n);


for(int a:arr1)
{
    System.out.print(a);
}
for(int a:arr2)
{
    System.out.print(a);
}

}

// public static void mul(int arr1,int arr2,int n)
// {
//     int ar[]=new int[n/2];
//     int i,j;
//     for(int k=0;k<n/2;k++)
//     {
    
    

//         ar[k]=arr1[k]*arr2[k+1];
    
//     }
//     for(int a:ar)
// {
//     System.out.print(a);
// }
// }

}
