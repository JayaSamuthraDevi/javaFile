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
        for(int j=0;j<a;j++)
        {
        if(arr[j]<0)
        {
            System.out.print(arr[j]+" ");
        }

        }
        for(int k=0;k<a;k++)
        {
        if(arr[k]>0)
        {
        System.out.print(arr[k]+" ");
        }
        }
    }
}
