import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=i+1;
        }
   
   
   if(check(arr,a)==1)
   {
 jump(arr,a);
 
   }

find(arr,a);


    }
static void jump(int[] arr,int a)
{
 for(int j=0;j<a;j++)
    {
        if(j%2!=0)
        {
      arr[j]=0;
        }
    }
}



static int check(int[] arr,int a)
{
    int count=0;
    for(int d:arr)
    {
      //  System.out.print(d+" ");


        if(d!=0)
        {
            count++;
        }
        
    }

    if(count==1)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}


static void find(int arr[],int a)
{
    for(int d:arr)
    {
        if(d!=0)
        {
            System.out.print(d);
        }
    }
}

}