abstract class AbstractClass
{
    AbstractClass()
    {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();
    
    public void non_a_method()
    {
        System.out.println("This is normal method of abstract class");
    }
}

class SubClass extends AbstractClass
{
    void a_method()
    {
        System.out.println("This is Abstract method");
    }


}

class MainClass
{
    public static void main(String args[])
    {
        AbstractClass s =new SubClass();
        s.a_method();
        s.non_a_method();
    }
}