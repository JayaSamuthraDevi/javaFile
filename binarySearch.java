import java.util.Scanner;
import java.util.Arrays;
class r{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int key =sc.nextInt();

        int mid=0,low=0,high;
        high =arr.length-1;

        while(high>=low)
        {

        mid=(low+high)/2;
        if(arr[mid]==key)
        {
                System.out.println("Index of element : "+mid);

        }
        
        
        if(arr[mid]>key)
        {
            high=mid-1;
            

        }
        else{
            low=mid+1;
        }
        
        }
       
            
        
    }
}
