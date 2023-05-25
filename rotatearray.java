import java.util.Scanner;
class a{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
         int arr[]= new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        for(int j=0;j<r;j++)
        {
         
                int temp=arr[4];
                
                arr[4]=arr[3];
                arr[3]=arr[2];
                arr[2]=arr[1];
                arr[1]=arr[0];
                arr[0]=temp;

           
            


        }
         for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
