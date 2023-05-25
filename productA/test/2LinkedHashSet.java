import java.util.*;
class LinkedHashSet1
{
    
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
   

   //default binary tree
LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
  
String s;
int arr1=0,arr2=0;

int n=sc.nextInt();
sc.nextLine();
  do{
   s=sc.nextLine();


   
  switch(s)
  {
    case "a":
     int key=sc.nextInt();
    
     l.add(key);
break;
     case "b":
      System.out.println("-------");
  Iterator<Integer> itr=l.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
       break;

       case "c":
       int key2=sc.nextInt();
         l.remove(key2);
       break;

       case "d":
        int key1=sc.nextInt();
       if(l.contains(key1))
       {
        arr1=1;
       }
       else
       {
        arr1=-1;
       }
       break;

       case "e":
       arr2= l.size();
       
     break;

     case "f":

      System.out.print(arr1+" "+arr2+" ");
        Iterator<Integer> itr1=l.iterator();
         while(itr1.hasNext()){
         System.out.println(itr1.next());
           }
           break;
  }
  }while(n-- >0);
}
}


