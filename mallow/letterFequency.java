// import java.util.*;  
// public class CountOccuranceOfChar1  
// {  
// public static void main(String args[])   
// {  
// String str;  
// int i, len;  
// int counter[] = new int[256];  
// Scanner scanner = new Scanner(System.in);  
// System.out.print("Please enter a string: ");  

// str = scanner.nextLine();  
// str=str.toLowerCase();

// len = str.length();  

// for (i = 0; i < len; i++)   
// {  
//  counter[(int) str.charAt(i)]++;  
// }  
// int max=0;

// for (i = 0; i < 256; i++)   
// {  
// if (counter[i] != 0)   
// {  
//     if(counter[i]>max)
// max=counter[i];
// }  
// } 


// while(len>0)
// {
//      for (i = 0; i < 256; i++)   
// {  
// if (counter[i] != 0)   
// { 
//     if(counter[i]==max)
// {
//     System.out.print((char) i ); 
   
//     len=len-1;

// }
// }}
//  max=max-1;

// }
// }  
// } 




import java.util.Scanner;  
public class CountOccuranceOfChar1  
{  
public static void main(String args[])   
{  
String str;  
int i, len;  
int counter[] = new int[256];  
Scanner scanner = new Scanner(System.in);  
System.out.print("Please enter a string: ");  
//reading a string from the user  
str = scanner.nextLine();  
//finds the length of the string  
len = str.length();  
// loop through the string and count frequency of every character and store it in counter array  
for (i = 0; i < len; i++)   
{  
    System.out.print("=>"+(int)str.charAt(i)+" ");

counter[(int) str.charAt(i)]++;  
}  
System.out.println();
//print Frequency of characters  
for (i = 0; i < 256; i++)   
{  
if (counter[i] != 0)   
{  
//prints frequency of characters      
System.out.println((char) i + " --> " + counter[i]);  
}  
}  
}  
} 