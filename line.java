import java.util.Scanner;
class r{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();

        

        if(((x1==x2)||(x2==x3)||(x1==x3))&&(y1==y2)||(y2==y3)||(y3==y1))
        {
             System.out.print("Yes");
        }
        else
        {

            
        float m1=((x2-x1)/(y2-y1));
        float m2=((x3-x2)/(y3-x2));
        if(m1==m2)
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
        }
    }
}
