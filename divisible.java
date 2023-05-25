import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		 int a= sc.nextInt();
		
		 if(a%3!=0) {
			
			 System.out.println("The num not divisible by 3 and the remainder is "+a%3);
			 
		 }
		 else {
			 System.out.println("The num divisible by 3");
		 }
		
	}

}
