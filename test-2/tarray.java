import java.util.*;
class test
{
    public static void main(String agrs[])

    {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
    
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++)
        {
                      
                    int j=0;
                System.out.print(arr[i][j]+" ");
               
        }
      
        for(int k=2;k>=0;k--)
        {
              int j=1;
            System.out.print(arr[k][j]+" ");
        }
        for(int k=0;k<3;k++)
        {
              int j=2;
            System.out.print(arr[k][j]+" ");
        }
    }
}