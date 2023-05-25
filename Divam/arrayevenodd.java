import java.util.Scanner;
 
 class array{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        String s="";
        String r="";
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                r=r+" "+arr[i];

            }
            else
            {
                s=s+" " +arr[i];
            }
        }
    System.out.print(r+s);
    }
 }