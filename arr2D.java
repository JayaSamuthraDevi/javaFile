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
                System.out.print(arr[i][j]);
            }
            System.out.println();
         }
//    System.out.println("Sum of elements in array :");
//    int sum=0;
//           for(int i=0;i<row;i++)
//          {
//             for(int j=0;j<col;j++)
//             {
//                  sum+=arr[i][j];
//             }
//          }
//    System.out.println(sum);



        int arr2[][]=new int [row][col];
        
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
         }

         System.out.println("2st Array:");

          for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
         }

         int newa[][]=new int [row][col];

            for(int i=0;i<row;i++)
            {
            for(int j=0;j<col;j++)
            { 
                newa[i][j]=arr[i][j]+arr2[i][j];
            }
            }

             System.out.println("Sum of Array is :");

             for(int i=0;i<row;i++)
            {
            for(int j=0;j<col;j++)
            {
                 System.out.print(newa[i][j]);
            }
            System.out.println();
            }


    }
}
