import java.util.*;
 
 class array{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
       
       
        String s1=convert(a);
        String s2=convert(b);

        //length of string
        int a1=s1.length();
        int b1=s2.length();
        int count=0,flip=0;
        if(a1<b1)
        {
             count=b1;
              flip=b1-a1;
        }
        else
        {
            count=a1;
            flip=a1-b1;
        }

        for(int i=0;i<count-1;i++)
        {
char ax=s1.charAt(i);
char bx=s2.charAt(i);

       if(ax!=bx)
       {
        flip++;
       }
        }
        System.out.println(flip+1);

    }
    public static String convert(int a)
    {
         int rem;
          String x="";
         while(a!=0)
        {
            rem=a%2;
            x=rem+""+x;
            a/=2;
        }
       return x;
        

    }
 }