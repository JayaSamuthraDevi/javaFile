class Quadrilateral
{
int area;

    void area(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
    {
         area=((x1*y2+x2*y3+x3*y4+x4*y1)-(y1*x2+y2*x3+y3*x4+y4*x1))*1/2;
         if(area<0)
         {
            area*=-1;
         }
         System.out.println("Quadrilateral : "+area);
    }
}

class Trapezoid extends Quadrilateral
{
    void area(int a,int b,int h)
    {
        area=(int)((a+b)*h/2);
        System.out.println("Trapezoid : "+area);
    }
}
class Rectangle extends Quadrilateral
{
    void area(int l,int b)
    {
        area=l*b;
         System.out.println( "Rectangle : " +area);
    }
}

class Square extends Quadrilateral
{
    void area(int a)
    {
        area =a*a;
         System.out.println("Square : "+area);
    }
}

class area
{
    public static void main(String args[])
    {
        Square s=new Square();
        Rectangle r =new Rectangle();
        Trapezoid t =new Trapezoid();

        t.area(1,2,3);
        r.area(2,3);
        s.area(2);
        s.area(-3,1,-1,4,3,2,1,-2);
    }
}