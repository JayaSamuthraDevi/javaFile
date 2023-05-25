import java.util.Scanner;

class coin
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={1,2,5,10,20,50,100,200,500,2000};
        int rem=0;
        String s=" ";
        
        while(n!=0)
        {
        rem=check(arr,n);
        
         s+=rem+" ";
         
        n-=rem;
        }
        System.out.print(s);
    }

    static int check(int arr[],int n)
    {
        int i=0,aa=0;
        while(i<=arr.length-1)
        {

            if(arr[i]>n)
            {
                aa= arr[i-1];
                break;
            }
            if((arr[i]<n)&&(arr[i]==arr[arr.length-1]))
            {
                aa=arr[i-1];
            }
        i++;
        }
        return aa;

    }
}