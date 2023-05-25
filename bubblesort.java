import java.util.Scanner;
class b{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int i;
         for( i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }

            for(int j=0;j<a;j++)
            {
                for(int k=0;k<a-j-1;k++)        //////////
                {
                    if(arr[k]>arr[k+1])         /////////
                    {
                        int temp=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                    }
                }
            }

            for(int ele : arr)
            {
                System.out.print(ele+" ");
            }

    }
}
