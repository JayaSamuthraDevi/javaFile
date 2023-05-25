import java.util.*;
class arrayList
{
public static void main(String args[])
{
  ArrayList<String> demo=new ArrayList<>();
//to add values
Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();
  sc.nextLine();
  for(int i=0;i<n;i++)
  {
    
    demo.add(sc.nextLine());
  }
  System.out.println("Before swapping");
System.out.println(demo);
 System.out.println("After swapping");
String a=demo.get(0);
String b=demo.get(2);
 demo.set(0,b);
 demo.set(2,a);

System.out.println(demo);

}
}