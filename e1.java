import java.util.Scanner;
class s{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();

        if((n<=20)&&(n>=1))
        {
        System.out.println("Yes");
      
            System.out.print("H");
            for(int i=0;i<n-2;i++)
            {
                System.out.print("B");
            }
            System.out.print("H");
                
        }
        else
        {
        System.out.println("No");
        }

    }
}
