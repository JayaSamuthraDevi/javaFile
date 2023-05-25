import java.util.*;
class q
{
    
public static void main(String args[])
{
    
   
PriorityQueue<String> queue=new PriorityQueue<String>();
queue.add("Amit");
queue.add("Vijay");
queue.add("Karan");
queue.add("Jai");
queue.add("Rahul");

System.out.println("head:"+queue.element());//returns 1st element in queue
System.out.println("head:"+queue.peek());//returns 1st element in queue

System.out.println("iterating the queue elements:");
Iterator itr=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

queue.remove();// removes the 1st element from queue
queue.poll();// removes the 1st element from queue

System.out.println("after removing two elements:");

//cannot use same iterator 
// different iterator variable should be used  to display queue after removing elements

Iterator<String> itr2=queue.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}

}
}