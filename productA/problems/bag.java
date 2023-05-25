import java.util.*;
class Bag<T>
{
   
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }   

   public void display(T arrCoin)
   {
    System.out.println("Coins");

    
    for(int i=0;i<length(arrCoin);i++)
    {
        System.out.println(i);
    }
   
   }
}

class NoteAndCoin
{

 public static void main(String[] args) 
   {
      Bag<Integer> intBag = new Bag<Integer>();
      Bag<String> strBag = new Bag<String>();


ArrayList<Interger> arrCoin=new ArrayList<Interger>();
  ArrayList<Interger> arrNote=new ArrayList<>();
  
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      for(int i=0;i<n;i++)
      {
        String x=sc.nextLine();
        int y=sc.nextInt();
        sc.nextLine();
        strBag.add(x);
        intBag.add(y);
        System.out.printf("Integer Value :%d\n", intBag.get());
      //  System.out.printf("String Value :%s\n", strBag.get());

      
      int a=intBag.get();
      
      
    
if(strBag.get()=="Note")
{
    arrNote.add(a);
}
else
{
arrCoin.add(a);
}      


      
      }
    //   strBag.display(arrCoin);
    //   strBag.display(arrNote);
    System.out.println("Coins");

    
    for(int i: arrCoin)
    {
        System.out.println(i);
    }
      
   }
}
