import java.util.Scanner;
class ebill
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        userDetails s=new userDetails();
        s.getData();
        s.calculate();
        s.display();
    }
}
class userDetails{
    int units,a,x,y;
    double amount;
    String name;
    Scanner sc =new Scanner(System.in);
     void getData()
    {
        System.out.println("Enter customer no : ");
         a=sc.nextInt();
         sc.nextLine();
        System.out.println("Enter customer name : ");
        name=sc.nextLine();
         System.out.println("Enter Previous month reading : ");
         x=sc.nextInt();
        System.out.println("Enter Current month reading : ");
        y=sc.nextInt();
    }



    void calculate()
    {
        units=y-x;

        if(units<=100)
        {
            amount=units*1;
        }
        else if((units>=101)&&(units<=200))
        {
            amount=units*2.50;
        }
        else if((units>=201)&&(units<=500))
        {
            amount=units*4;
        }
        else
        {
            amount=units*6;
        }
    }



    void display()
    {
        
        System.out.println("customer no : "+a);
        System.out.println("customer name : "+name);
         System.out.println("total units: "+units);
        System.out.println("total amount : "+amount);
    }

}