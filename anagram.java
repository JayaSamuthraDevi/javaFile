
import java.util.*;
class test3{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
      
        
        String str1 =sc.nextLine();
        
        String str2 =sc.nextLine();

        // char[] s =new char[str1.length()];
        //   char[] r =new char[str2.length()];

        // for(int i=0;i<str1.length();i++)
        // {
        //     s[i]=str1.charAt(i);
        // }
        //  for(int j=0;j<str2.length();j++)
        // {
        //     r[j]=str2.charAt(j);
        // }

        //to change string to array

        char[] s =str1.toCharArray();
         char[] r =str2.toCharArray();
    
    // arrange letters in alphabetic order

        Arrays.sort(s);
        Arrays.sort(r);

  //check char is equal
        int count=0;
       for(int k=0;k<str1.length();k++)
       {
        
        if(s[k]!=r[k])
        {
            
            count++;
            
        }
       

        
        
       }

       if(count==0)
       {
        System.out.print(str1+" and "+str2+" are anagram");

       }
       else
       {
         System.out.println(str1+" and "+str2+" are not anagram");
         System.out.println(count+" letters are different");
       }


    }
}







// import java.io.*;
// import java.util.Scanner;
  
// class test3 {
//     public static void main (String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
       
    
//       char ch1,ch;
//       int count=0,count2=0;
//       while(t-- >0)
//       {
//         sc.nextLine();
//        String str=sc.nextLine();
    

//        String str1=sc.nextLine();
           
//       for (int i=0;i<str.length();i++)
//       {
//           ch= str.charAt(i); 
//           ch1=str1.charAt(i);
//           if(ch!=ch1)
//           {
//             count++;
//           }
            

//     }
//     if(count==str.length())
//     {
//       System.out.print("Anagram")  ;
//     }
//     else
//     {
//      System.out.print(count);
//     }
//       }
// }
// }
