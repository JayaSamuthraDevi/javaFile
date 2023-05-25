import java.util.*;
class rock
{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
int n,score,res=0,value,a=0,b=0;
n=sc.nextInt();


for(int i=0;i<n;i++)
{
    
char ar1 = sc.next().charAt(0);
char ar2 = sc.next().charAt(0);

if(ar1=='A')
{
    a=1;
}
if(ar1=='B')
{
    a=2;
}
if(ar1=='C')
{
    a=3;
}

if(ar2=='X')
{
    b=1;
}
if(ar2=='Y')
{
    b=2;
}
if(ar2=='Z')
{
    b=3;
}

if(a==b)
{
    value=3;
    score=3;
}
else if(a<b)
{
    value=b;
    score=6;
}
else
{
    value=b;
    score=0;
}
res+=(value+score);
}

System.out.print(res);

}
}
