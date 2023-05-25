import java.util.Scanner;
class p{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        int s=n+2;
        int w=n;
        int y=n+3;
            for( i=0;i<s;i++){
            System.out.print("@");
            }

        
           System.out.println();
                 
               
                       
    //               for( k=s;k>0;k--)
    // {
    //     System.out.print(" ");
    // }
    //  for(j=1;j<=n+5;j++)
    // {
    //     System.out.print("#");

    
          
    //         if(j%2==0) 
    //         {

    //               System.out.println();  
    //               for( k=w;k>0;k--)
    // {
    //     System.out.print(" ");
    //     w-=2;
    // }
                  
               
    //         }
           
    //        }
        
                 

for(i=1;i<n;i++)
{
    
    for(k=0;k<y;k++)
    {
        System.out.print(" ");
      
        
    }
    
    for(j=1;j<3;j++)
    {
        System.out.print("#");
    }
    
    System.out.println();
    y-=2;
}


            for( i=0;i<s;i++){
            System.out.print("@");
            }

        
       
                 }
    }
