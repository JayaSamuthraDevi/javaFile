import java.util.Scanner;
class binary
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int decimal =sc.nextInt();
        b_conversion b_con =new b_conversion();
        b_con.decimal=decimal;
        b_con.Binary_Con();
    }
}



class b_conversion
{
  int decimal,rem,num;
 void Binary_Con()
{
    while(decimal!=0)
    {
 rem=decimal%2;
 System.out.print(rem);
 decimal/=2;
    }
    
}  

}
