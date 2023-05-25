class Monkey 
{
    void jump()
    {
        System.out.println("jump");
    }
    void bite()
    {
         System.out.println("bite");
    }


}

interface BasicAnimal 
{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal
{
 public void eat()
{
    System.out.println("eat");
}
 public void sleep()
{
     System.out.println("sleep");
}

public static void main(String args[])
{

Human h= new Human();
h.eat();
h.sleep();
}

}

