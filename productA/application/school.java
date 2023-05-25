import java.util.*;

 //abstract class
 abstract class Subject
 {
   abstract void displaySubject();
  //abstract void displayStaff();
 }

 class SubjectDetails extends Subject
{
    void displaySubject()
    {
        System.out.println("The Subjects are");
        System.out.println("English");
        System.out.println("Tamil");
        System.out.println("Maths");
        System.out.println("Science");
        System.out.println("Social");
    }
}

class StaffDetails extends Subject
{
  void displaySubject()
  //  void displayStaff()
    {
        System.out.println("The Subjects Staffs are");
        System.out.println("English-Staff1");
        System.out.println("Tamil-Staff2");
        System.out.println("Maths-Staff3");
        System.out.println("Science-Staff4");
        System.out.println("Social-Staff5");
    }
}
class school
{
    public static void main(String args[])
    {

        Scanner sc =new Scanner(System.in);
        //Details d =new Details();
        //d.getDetails();
        show s=new show();
        s.getDetails();
        s.display();
        Marks m=new Marks();
        m.enterMarks();
        Subject sub =new SubjectDetails();
        Subject sub1=new StaffDetails();
        sub.displaySubject();
        sub1.displaySubject();
        //sub1.displayStaff();

    }
    
}

class Details
{
static  String name;
static int roll;
static int standard;

static void getDetails()
    {
         Scanner sc =new Scanner(System.in);
         name=sc.nextLine();
         roll =sc.nextInt();
         standard =sc.nextInt();
    }


}

class show extends Details
{
     show()
    {
        System.out.println("School :");
        System.out.println("Enter Student Details :");
    }


    static void display()
    {
     Details d=new Details();
      //show s=new show();
        System.out.println("Student Details :");
        System.out.println("Name : "+d.name);
        System.out.println("Roll : "+roll);
        System.out.println("Standard : "+standard);
    }

   
}


class Marks extends Details
{

static void enterMarks()
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Student Marks :");
    int total_Marks =sc.nextInt();
    compare(total_Marks);
}

static void compare(int total_Marks)
{
    if((total_Marks>50)&&(total_Marks<85))
    {
        System.out.println("Your mark is Average");
    }
    else if(total_Marks>85)
    {
         System.out.println("Your mark is Excellent");
    }
    else
    {
         System.out.println("Your mark is Very Low");
    }

}

}