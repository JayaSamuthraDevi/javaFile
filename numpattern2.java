import java.util.*;
class numpattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
int i,j,k,r;
k=(a/2)+1;
r=(a/2);
        for(i=1;i<=a;i++)
        {
           
            for(j=1;j<=a;j++){
               

                if(((i==k)||(i==r))&&((j==k)||(j==r)))
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