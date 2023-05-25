
import java.util.*;
class Camel{
public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    String result="";
    String remaining="";
String[] str=st.split(" ");
for(String s: str){
result=s.substring(0,1).toUpperCase();
System.out.print(result);
remaining=s.substring(1,s.length()).toLowerCase();
System.out.print(remaining +" ");
    }
}
}
