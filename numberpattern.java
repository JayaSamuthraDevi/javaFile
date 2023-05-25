import java.util.Scanner;
class count{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        int a=7,b=12;

        for(int i=1;i<=n;i++)
        {
            if(i<=a){
            for(int j=1;j<=i;j++)
            {
                 System.out.print("*");
            }
              System.out.print(i);
            }
          
          
             for(int j=i;j<7;j++)
            {
                 System.out.print("*");
                 
            }
            for(int k=i;k<7-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        //    if(i==1)
        //    {
        //      System.out.println(i+12);
        //    }
        //    if(i==2)
        //    {
        //      System.out.println(i+10);
        //    }
        //    if(i==3)
        //    {
        //      System.out.println(i+8);
        //    }
        //    if(i==4)
        //    {
        //      System.out.println(i+6);

        //    }
        //     if(i==5)
        //    {
        //      System.out.println(i+4);

        //    }
        //    if(i==6)
        //    {
            
        //      System.out.println(i+2);

        //    }
           
        //    if(i>13){
        //     for(int j=1;j<=i;j++)
        //     {
        //          System.out.print(" ");
        //     }
        //       System.out.print(i);
        //     }
        
        }
       
            
        
    }
}
