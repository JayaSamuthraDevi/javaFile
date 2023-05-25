import java.util.*;
class arrayList
{
public static void main(String args[])
{
  ArrayList<Integer> demo=new ArrayList<>();
//to add values
  demo.add(1);
  demo.add(3);
  demo.add(5);
   demo.add(4);
  demo.add(2);
System.out.println(demo);
//to update value on index
demo.set(2,10);//(position,value)



  System.out.println(demo);

  ArrayList<Integer> list2=new ArrayList<>();
//to add values
//newlist.addAll(old_list)
  list2.addAll(demo);
  
 System.out.println("addAll:"+list2);

//to remove element
demo.remove(2);

  System.out.println("after removal:"+demo);

  //to sort
  demo.sort(Comparator.naturalOrder());
    System.out.println("after Sorting:"+demo);

//to get values
System.out.println("value :"+list2.get(1));

//to find size
System.out.println("size :"+list2.size());

//to get values run time
Scanner sc =new Scanner(System.in);
int s=sc.nextInt();
ArrayList <Integer> list3 =new ArrayList<>();
for(int i=0;i<s;i++)
{
    list3.add(sc.nextInt());
}

System.out.println("runtime list :"+list3);
}
}
