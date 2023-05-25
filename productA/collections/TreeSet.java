import java.util.*;
class Tree
{
    
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
   

   //default binary tree
TreeSet<String> al=new TreeSet<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

  //iterate in ascending order
   // Iterator<String> itr =al.iterator();

    //iterate in descending order
    Iterator<String> itr =al.descendingIterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
 
}

}