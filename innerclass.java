//class can have variables, methods and class

class  outerclass    //file name------outerclass.class
{
    int x=5;
   public static void  display0()
    {
        System.out.println("Hello");
    }

    static class  innerclass    //file name-------outerclass$innerclass.class
    {
        int y=5;
       public static  void  display1()
    {
        System.out.println("Welcome");
    }
    }

   
  
}

 class classdemo  //file name------classdemo.class
    {
        static int y=5;
       public static void display2()
    {
        System.out.println("Hii");
    }
        public static void main(String args[])
        {
            outerclass outer =new outerclass();

            //normal calling of another class by creating object //to display outer class method
           // outer.display0();  


            //for member class


           //to display inner class method
           outerclass.innerclass inner =outer.new innerclass();
           //syntax
           //can call by object of outer only
           //outer_class_name.inner_class_name   object_of_innerclass  =  object_of_outerclass.new innerclass constructor();

          


           //for static class

           //to display inner class method
          outerclass.innerclass inner = new outerclass.innerclass();
           //syntax
           //can directly call by class name
           //outer_class_name.inner_class_name   object_of_innerclass  =  new outerclass_name.innerclass constructor();

            inner.display1();
        }
    }
