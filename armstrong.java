import java.util.Scanner;
class armstrong{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        int rem,result=0,a;

        a=num;

        int digit=0;
        while(a!=0)
        {
            a/=10;
            digit++;
        }
        a=num;
        while(a!=0)
        {
            rem=a%10;
            result+=Math.pow(rem,digit);
            a/=10;
        }
        if(result==num)
        {
            System.out.print("armstrong");
        }
        else{
            System.out.print("not");
            
        }




    }

}