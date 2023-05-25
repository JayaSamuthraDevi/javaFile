
class start
{
//instance variable
// static int a=5;
// String s="hello";
// int b;
// String str="";

int roll;
String name;

//method
public void setvalue(int x,String s)
{
     // x++;
    // str=s;
    // // System.out.println(x+" "+str);
    roll=x;
    name=s;
 
}
void display()
{
      System.out.println(roll+" "+name);
}

public static void main(String args[])
{
start s1=new start();
start s2=new start();
start s3=new start();
// //initialization
// s1.b=10;
// s2.b=20;


// System.out.println(a+" "+s1.b);
// System.out.println(s1.setvalue(1,"Hello"));

// //second object 
// System.out.println(s2.b);
// System.out.println(s2.setvalue(2,"World"));


s1.setvalue(1,"One");
s2.setvalue(2,"Two");
s1.display();
s2.display();

}

}