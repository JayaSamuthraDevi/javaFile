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



int count=0;
for(int i=2;i<r;i++)
{
    for(int j=2;j<c;j++)
    {
       // System.out.print(arr[i][j]);
        if(arr[i][j]>(arr[i-1][j])||arr[i][j]>(arr[i][j-1]))
        {
            count++;
        }
    }
}


System.out.print(r+c+(c-2)+(r-2)+count);
    
   
    
    }
}


/*
5 5
3 0 3 7 3
2 5 5 1 2
6 5 3 3 2
3 3 5 4 9
3 5 3 9 0
5
*/