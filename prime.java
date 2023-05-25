import java.util.Scanner;
class  prime{
   public static void main(String args[]){

      Scanner sc =new Scanner(System.in);
      int a = sc.nextInt();

   int i,j;

   for(i=2;i<=a;i++)
   {
int count=0;
for(j=2;j<=i/2;j++)
{
   if(i%j==0)
   {
      count++;
      break;
   }
}
if(count==0)
{
   System.out.print(i);
}

   }

    }

}




























      // int  count=0,i;

      // if(a==1||a==0)
      // {
      //    System.out.println("Not prime");
      // }
      // else{
      // for(i=2;i<=a/2;i++){
      //    if(a%i==0)
      //    {
      //       System.out.println("Not prime");
      //       count=1;
      //       break;
      //    }
        
         
      // }
      // if(count==0)
      //   {
      //    System.out.println("prime");
      //   }
       
      // }
      
      
     
   
