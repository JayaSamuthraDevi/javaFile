import java.util.Scanner;
class rev{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();

        char[] a=s.toCharArray();
        String str ="";
        System.out.println("The reverse of strig is: ");
        for(int i=a.length-1;i>=0;i--)
        {
            str+=(a[i]);
        }
    System.out.println(str);

    if(s.equals(str))
    {
        System.out.println("Plaindrom");

    }
    else{
        System.out.println("not Plaindrom");
    }
       

    }
}