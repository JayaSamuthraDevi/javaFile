import java.util.Scanner;

class l
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        check(arr,n);
    }
    static void check(int arr[],int n)
    {
        for(int i=1;i<n-1;i++)
        {
            if((arr[i-1]<arr[i])&&(arr[i]>arr[i+1]))
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[n-1]);
    }
}

/*
5
1 2 3 4 0
4 0
PS C:\Users\DELL\Desktop\java\rtcjava\productA\problems\nightcls> java leader.java
6
16 17 4 3 5 2
17 5 2
*/