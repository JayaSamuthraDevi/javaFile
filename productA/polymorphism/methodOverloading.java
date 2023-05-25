
//overloading the same function with different arguments

// class Adder {
//     static int add(int a,int b){return a+b;}
//     static int add(int a,int b,int c){return a+b+c;}
// }
// class TestOverloading{
//     public static void main(String args[])
//     {
//         System.out.println(Adder.add(11,11));
//         System.out.println(Adder.add(11,11,11));
//     }
// }


//overloading the same function with same no.of arguments with different datatype

class Adder1 {
    static int add(int a,int b){return a+b;}
    static double add(double a,double b){return a+b;}
}
class TestOverloading1{
    public static void main(String args[])
    {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11.1f,11.1f));
    }
}


//can overloading main function by changing aguments value