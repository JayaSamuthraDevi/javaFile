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
System.out.println("rotate(1-anti/0-colck): ");

int flag=sc.nextInt();

if(flag==0)
{

for(int i=0;i<a;i++)
{
    for(int j=a-1;j>=0;j--)
    {
        System.out.print(arr2[i][j]+" ");
    }
      System.out.println();
}
}

if(flag==1)
{
    for(int i=a-1;i>=0;i--)
    {
    for(int j=0;j<a;j++)
{
    
        System.out.print(arr2[i][j]+" ");
    }
      System.out.println();
}
}


}
}
/*
3
1 2 3 4 5 6 7 8 9
1 2 3
4 5 6
7 8 9
Transpose matrix :
1 4 7
2 5 8
3 6 9
rotate(1-anti/0-colck):
1
3 6 9
2 5 8
1 4 7

0
7 4 1
8 5 2
9 6 3
*/
