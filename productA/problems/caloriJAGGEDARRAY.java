import java.util.*;
class rock
{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
int r=sc.nextInt();
//declaration of jagged array
int arr[][]=new int arr[r][];

int c;

for(int i=0;i<r;i++)
{

    c=sc.nextInt();
    int sum=0;
    arr[i]=new int[c];
    for(int j=0;j<c;j++)
    {

        arr[i][j]=sc.nextInt();

        sum+=arr[i][j];

    }

}

}
}