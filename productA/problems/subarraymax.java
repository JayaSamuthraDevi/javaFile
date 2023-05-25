import java.util.Scanner;
class p{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         int k=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        splitArray(arr,k,n);
    }

    static void splitArray(int arr[],int k,int n)
    {
        int i=0,j=0,max=0;
        while(j<n-k)
           {
            for(j=i;j<i+k+1;j++)
            {
               
                if(max<arr[j])
                {
                max=arr[j];

                }
            }
            
            System.out.print(max+" ");
            i++;
           }
        
        //return arr;
    }
}


//nput: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3  
//Output: 3 3 4 5 5 5 6
//Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4 
// Output: 10 10 10 15 15 90 9