import java.util.Scanner;
class r{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
         int col=sc.nextInt();
         int arr[][]=new int [row][col];
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
         }

         System.out.println("1st Array:");

          for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }

        int row2=sc.nextInt();
         int col2=sc.nextInt();


        int arr2[][]=new int [row2][col2];
        
         for(int i=0;i<row2;i++)
         {
            for(int j=0;j<col2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
         }

         System.out.println("2st Array:");

          for(int i=0;i<row2;i++)
         {
            for(int j=0;j<col2;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
         }


        System.out.println();
        
        if(col==row2)
        {

            int newa[][]=new int [row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    for(int k=0;k<col;k++)
                {
                    newa[i][j]+=arr[i][k]*arr2[k][j];
                }
                }
            }
            for(int i=0;i<row2;i++)
         {
            for(int j=0;j<col2;j++)
            {
                System.out.print(newa[i][j]+" ");
            }
            System.out.println();
         }



        }
        else
        {
            System.out.println("Can't multiply");
        }
         

    }
}
