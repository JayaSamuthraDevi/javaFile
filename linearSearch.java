import java.util.Scanner;
class r{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        int arr[]={1,2,3,4,5};
        int flag=0;
        int a=sc.nextInt();
        for(int i=0;i<5;i++)
        {
           if( arr[i] ==a)
           {
           flag=1;
           break;
           }
        }
        if(flag==1)
        {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
