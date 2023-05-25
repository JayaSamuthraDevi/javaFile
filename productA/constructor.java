class constructor
{
     int y;
     String st;


//non parametorized constructor
constructor()
{
int a=1;
String str ="Hello";
System.out.println(a+" "+str);
}


//parametorized constructor
constructor(int a,String s)
{
    y=a;
    st=s;
   System.out.println(y+" "+st);
}


//constructor overloading
constructor(int a,String s,String b)
{
    
   int  roll=a;
   String name=b;
   String dept=s;
   System.out.println(roll+" "+name+" "+dept);
}


//copy constructor
constructor(constructor obj)
{

int q=obj.y;
String w=obj.st;
System.out.println(obj.y+" "+w);
}



public static void main(String args[])
{
    System.out.println("constructor:");
constructor s1=new constructor();
//constructor overloading
System.out.println("constructor overloading:");
constructor s2 =new constructor(10,"Wellcome");
constructor s3 =new constructor(20,"CSE","name");
//copy constructor
System.out.println("Copy constructor:");
constructor s4=new constructor(s2);

}
  
}