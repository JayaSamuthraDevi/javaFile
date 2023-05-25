
import java.util.Scanner;

class rectangle 
{
     public void cal(int l, int b )
    {
        System.out.println(l*b);
    }
}


class  Main extends rectangle
{
public static void main(String args[])
{
    //Scanner sc =new Scanner(System.in);
    //int l=sc.nextInt();
    //int b=sc.nextInt();
  
    Main r = new Main();
    r.cal(1,2);
    //System.out.println(r.cal(1,2));


}
}




// class Animal{  
// void eat(){System.out.println("eating...");}  
// }  
// class Dog extends Animal{  
// void bark(){System.out.println("barking...");}  
// }  
// class TestInheritance{  
// public static void main(String args[]){  
// Dog d=new Dog();  
// d.bark();  
// d.eat();  
// }}  




class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}