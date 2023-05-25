import java.util.Scanner;
 
 class array{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }

       


        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    
                }
            }
            
            System.out.println(arr[i]);
        }
    }
 }