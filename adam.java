// Step1 square of number  (num)
// Step2 reverse of number (rev(num))
// Step3 square of num Square(rev(num))
// Step4 reverse of num in Step3
// Step5 check num of step4 (== / !=) step1 


import java.util.Scanner;
class adam{
public static void main(String args[]){

Scanner sc =new Scanner(System.in);
int a = sc.nextInt();

int rev=0,b=0,x,y,real;
real=a;
while(a!=0)
{
    rev=(rev*10)+(a%10);
    a/=10;
}


x=real*real;
y=rev*rev;

while(y!=0)
{
    b=(b*10)+(y%10);
    y/=10;
}

if(x==b)
{
    System.out.print("Adams num");
}
else
{
    System.out.print("not Adams num");
}

}
}