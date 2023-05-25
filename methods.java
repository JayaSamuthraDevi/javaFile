import java.util.Scanner;
class method{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int pow=sc.nextInt();
        int base =sc.nextInt();

power p =new power();
p.pow=pow;
p.base=base;
p.power();


   }
}

class power{
        int res =1;
int pow,base;
    public void power()
    {
         System.out.println("********("+Math.pow(pow,base)+")********");
        
        while(pow!=0)
        {
            res=res*base;
            pow--;
        }
       
        System.out.print(res);
    }
}