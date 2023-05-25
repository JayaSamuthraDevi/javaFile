import java.util.*;
class butterfly{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
int i,j,k;
for(i=1;i<=a;i++)
{
    for(j=1;j<=i;j++)
    {
        System.out.print("*");

    }
    for(j=i;j<=a;j++)
    {
        System.out.print(" ");
    }
    for(j=i;j<=a;j++)
    {
        System.out.print(" ");
    }
     for(j=1;j<=i;j++)
    {
        System.out.print("*");

    }
    
   
    
    
System.out.println();
}

    }
}
