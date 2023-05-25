import java.util.*;

abstract class Matrix 
{  
   abstract void matrix(int a[],int b[]);
}

class Rock extends Matrix
{
System.out.println("Matrix Multi :");
void matrix(int a[],int b[])
{
int mul[][]=new int [a.length()][a.length()];
for(int i=0;i<a;i++)
{
    for(int j=0;j<a;j++)
    {
        for(int k=0;k<a;k++)
        {
        mul[i][j]+=a[i][k]*b[k][j];
        
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


