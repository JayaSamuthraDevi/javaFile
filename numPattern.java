import java.util.*;
//print 0 at center


class numpattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
int i,j,k;
k=(a/2)+1;
        for(i=1;i<=a;i++)
        {
           
            for(j=1;j<=a;j++){
               

                 if((i==k)&&(j==k))
            {
                System.out.print("0");
            }
            else{
                 System.out.print("1");
            }
            }
           
            
            System.out.println();
        }


        System.out.println("************");

 
      
      for(int s=1;s<=5;s++)
      {
        for(int r=1;r<=5;r++)
        {
          if(((s%2==0)&&(r==3))||((s==3)&&(r%2==0)))
          {
            System.out.print("0");
          }
          else{
          System.out.print("1");
          }
        
        }
        System.out.println();
      }
    }
  }
  