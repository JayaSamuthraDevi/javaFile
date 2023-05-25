class s
{

public static void main(String args[])
{
    int n=15,p=1,d,q=0;
    System.out.print(q+" "+p+" ");
    for(int i=0;i<n;i++)
    {
       d=(p*2)+q;
       q=p;
       p=d;

       System.out.print(d+" ");
    }
}
}