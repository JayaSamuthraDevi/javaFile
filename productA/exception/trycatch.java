class t{

public static void main(String args[])
{
int a=2,b=0,c=0;
try{
    
      System.out.println("c");
      //block executes till an exception occured
    c=a/b;
    System.out.println("c");
}
catch(ArithmeticException e)
{
    System.out.println("Error:");
}
catch(RuntimeException e)
{
    System.out.println("Null pointer error");
}
/*
catch(Exception e)
{
    System.out.println("Catches all exception so that other catch blocks throws error")
}
*/
 



}
//according to exception occured that specified exception is executed from catch block
}