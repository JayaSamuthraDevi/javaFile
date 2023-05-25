import java.util.*;

class l
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new  int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
       
    
        
       arrange(arr,n);
       
     
    }

    
        

    static void arrange(int[] arr,int n)
    {
        int a[]=new int[n];
        int flag=0;
         int max=n-1;
        int min =0;
        for(int i=0;i<n;i++)
        {
            
        if(flag==0)
        {
             
            a[i]=arr[max];
          
          max--;
            flag++;
        }

        else
        {
            a[i]=arr[min];
            min++;
            flag--;
        }
        
       
        }
        for(int y:a)
        {
            System.out.print(y+" ");
        }
    }
}

/*n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3

n = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
*/