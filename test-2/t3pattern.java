import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t>0)
        {
            int a=sc.nextInt();
 pattern(a);

            t--;
        }
       

    }

    public static void pattern(int a){


star(a);
space(a);
py(a);
    }

    public static void star(int a)
    {
        
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<i;j++)
                {
                System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void py(int a)
    {
        for(int i=0;i<a;i++)
        {
            
              
            for(int j=a;j>1;j--)
            {
                System.out.print("#");
            }
            
                System.out.println();
        }
    }
    public static void space(int a)
    {
        for(int i=0;i<a;i++)
            {
                for(int j=a;j>0;j--)
                {
                System.out.print(" ");
                }
                System.out.println();
            }
    }
}