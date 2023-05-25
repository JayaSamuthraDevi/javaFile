import java.util.*;
class  ArrayL
{
    
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    
    System.out.println("1.ArrayList_iterate1_using_foreach_and_using_collection_add_method \n  2.ArrayList_iterate2_using_iterator_hasNext_next \n  3.ArrayList_using_user_defined_objects \n 4.ArrayList_using_collection_addAll_method \n  5.ArrayList_using_collection_removeAll_method \n 6.ArrayList_using_collection_retainAll_method \n7.ArrayList_ListIterator_add_at_position_get_hasPrevious_previous \n8.list_user_defined_object");

    int ch =sc.nextInt();


 
   switch(ch)
    {
        case 1:
        iterate_Foreach();
         break;
        case 2:
        iterate_Hasnext();
         break;
        case 3:
        user_defined_objects();
         break;
        case 4:
        addAll_method();
         break;
        case 5:
        removeAll_method();
         break;
        case 6:
        retainAll_method();
         break;
        case 7:
        array_hasPrevious_previous();
         break;
        case 8:
        list_user_defined_object();
        break;
        /*
        101 Let us C Yashwant Kanetkar BPB 8
102 Data Comm Networking Forouzan Mc Graw Hill 4
103 Operating System Galvin Wiley 6
*/
    }

}

public static void iterate_Foreach()
{

ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

  for(String obj:al)
    System.out.println(obj);
 

}



public static void iterate_Hasnext()
{
 ArrayList<String> al=new ArrayList<>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());

  }
}

 public static void user_defined_objects()
 {

Student s1=new Student(101,"Sonoo",23);
  Student s2=new Student(102,"Ravi",21);
  Student s3=new Student(103,"Hanumat",25);
    
  ArrayList<Student> al=new ArrayList<Student>();
  al.add(s1);
  al.add(s2);
  al.add(s3);
  
  Iterator<Student> itr=al.iterator();
  while(itr.hasNext()){
    Student st=itr.next();
    System.out.println(st.rollno+" "+st.name+" "+st.age);
  }
 }



public static void addAll_method()

{
ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ajay");
  
  ArrayList<String> al2=new ArrayList<String>();
  al2.add("Sonoo");
  al2.add("Hanumat");
  al2.add("Ravi");
  
  al.addAll(al2);  

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }


}




public static void removeAll_method()
{
ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ajay");
  
  ArrayList<String> al2=new ArrayList<String>();
  al2.add("Ravi");
  al2.add("Hanumat");
  
  al.removeAll(al2);

  System.out.println("iterating the elements after removing the elements of al2...");
  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
   }
}


public static void retainAll_method()

{
ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ajay");
  
  ArrayList<String> al2=new ArrayList<String>();
  al2.add("Ravi");
  al2.add("Hanumat");
  
  al.retainAll(al2);

  System.out.println("iterating the elements after retaining the elements of al2...");
  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }


}



public static void array_hasPrevious_previous()
{

  ArrayList<String> al=new ArrayList<String>();
al.add("Amit");
al.add("Vijay");
al.add("Kumar");
al.add(1,"Sachin");

System.out.println("element at 2nd position: "+al.get(2));

ListIterator<String> itr=al.listIterator();

System.out.println("traversing elements in forward direction...");
while(itr.hasNext()){
System.out.println(itr.next());
 }


System.out.println("traversing elements in backward direction...");
while(itr.hasPrevious()){
System.out.println(itr.previous());
 }
}

public static void list_user_defined_object()
{
 //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Comm Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}

}


class Student{
  int rollno;
  String name;
  int age;
  Student(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
  }
}
//user defined data type
  class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  

}