import java.util.*;
class Treemap
{
    
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
   

   //default binary tree
TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
  
String s;
int arr=0,arr2=0;
  do{
   s=sc.nextLine();


   
  switch(s)
  {
    case "a":
     int key=sc.nextInt();
     int val=sc.nextInt();
     t.put(key,val);
break;
     case "b":
       int key1=sc.nextInt();
       arr= t.get(key1);
         //System.out.println( t.get(key1));
        
       break;
       case "c":
       arr2= t.size();
        //System.out.println( t.size());
       break;
       case "d":
       int key2=sc.nextInt();
         t.remove(key2);
       break;
       case "e":
       System.out.print(arr+" "+arr2+" ");
        for(Map.Entry m:t.entrySet()){    
       System.out.println(m.getKey());    //gets value
      }    
     break;
  }

  }while(s!="e");
}
}
