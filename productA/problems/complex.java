import java.util.*;
class rock
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int bi=sc.nextInt();
         int x=sc.nextInt();
        int yi=sc.nextInt();

        sum(a,bi,x,yi);
        diff(a,bi,x,yi);
        mul(a,bi,x,yi);

    }

    public static void sum(int a,int bi,int x,int yi)
    {
        int real,img;
        real=a+x;
        img=bi+yi;
        System.out.println(real+"+"+img+"i");
    }

     public static void diff(int a,int bi,int x,int yi)
    {
        int real,img;
        real=a-x;
        img=bi-yi;
        System.out.println(real+"+"+img+"i");
    }
      public static void mul(int a,int bi,int x,int yi)
    {
        int real,img;
        real=(a*yi)+(bi*x);
        img=(x*bi)+(a*yi);
        System.out.println(real+"+"+img+"i");
    }
}