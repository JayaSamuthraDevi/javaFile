import java.util.*;
class rectangle
{
	void display(int width,int height)
	{
		System.out.println(width +" " +height);
	}
	void display(int area)
	{
		System.out.println(area);
	}
}
class rectangle_area extends rectangle
{
    static int width;
    static int height;
	public static void main(String args[])
	{
		
		int area = read_input();
		rectangle r1=new rectangle();

		r1.display(width,height);
		r1.display(area);
	}
	static int read_input()
	{
		
		
			Scanner sc=new Scanner(System.in);
			width=sc.nextInt();
			 height=sc.nextInt();
			int area= width * height;
			return area;
			
	}
	
}