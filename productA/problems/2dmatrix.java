import java.util.*;
class rock
{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);

int a=sc.nextInt();
int arr[][]=new int [a+1][a+1];

for(int i=0;i<a;i++)
{
    for(int j=0;j<a;j++)
    {
        arr[i][j]=sc.nextInt();
    }
}

for(int i=0;i<a;i++)
{
    for(int j=0;j<a;j++)
    {
        System.out.print(arr[i][j]+" ");
    }
     System.out.println();
}
int arr2[][]=new int[a+1][a+1];
System.out.println("Transpose matrix :");

for(int i=0;i<a;i++)
    {
for(int j=0;j<a;j++)
{       
                arr2[i][j]=arr[j][i];
                System.out.print(arr2[i][j]+" ");
 }
     System.out.println();
}

int mul[][]=new int [a+1][a+1];
System.out.println("Matrix Multi :");
for(int i=0;i<a;i++)
{
    for(int j=0;j<a;j++)
    {
        for(int k=0;k<a;k++)
        {
        mul[i][j]+=arr[i][k]*arr2[k][j];
        
        }
    }
}

for(int i=0;i<a;i++)
{
    for(int j=0;j<a;j++)
    {
        
        System.out.print(mul[i][j]+" ");
    }
     System.out.println();
}

}
}