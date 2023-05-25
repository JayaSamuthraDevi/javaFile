import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No of Sets:");
        int n=s.nextInt();
        int arr[]=new int[n*2];
        for(int i=0;i<n*2;i+=2)
        {
            System.out.println("Enter Sets:");
            arr[i]=s.nextInt();
            arr[i+1]=s.nextInt();
        }
        int next=0;
        for(int i=0;i<n*2;i+=2)
        {
            if(next<arr[i])
            {
                next=arr[i+1];
                System.out.println("OUTPUT:"+arr[i]+" "+arr[i+1]);
            }
        }
    }
}
