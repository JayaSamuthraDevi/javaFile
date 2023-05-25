import java.util.*;

class string

   {

      public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            String s=sc.nextLine();
            String[] a=s.split(" ");//split the string to array .plit("where to split symbol",number of words to split)
            for(String t:a)
            {
                System.out.println(t);
            }
            System.out.println();
            for(int i=a.length-1;i>=0;i--)
            {
                 System.out.println(a[i]);
            }
      }
   }
