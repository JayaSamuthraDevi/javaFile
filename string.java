// class Main

//  {

//   public static void main(String[] args){

//  StringBuffer str = new StringBuffer("Hello");

//   str.deleteCharAt(0);

//  System.out.print(str);

//  }

// }
import java.util.*;

class Main

   {

      public static void main(String[] args){

   String x = "abc";

   String y = "class";
    String a = "   abc   hsi iop  cns   ";

   x=x.concat(y);

   System.out.println(x);
   System.out.println(a.trim());//elemenate front and last spaces
   System.out.println(x.toUpperCase());
      System.out.println(x.toLowerCase());
         System.out.println(x.substring(0));
             System.out.println(x.substring(1,3));
              System.out.println(x.length());//length()--for string ------[.length for array]
     
     //convert sstring to char array
      char l[]=y.toCharArray();
      //sort the alphabets in array
      Arrays.sort(l);
      for(char t:l)
      {
      System.out.print(t);
      }

      

 }
}