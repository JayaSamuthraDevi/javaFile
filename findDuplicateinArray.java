import java.util.Scanner;
class findD{ 
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        duplicateNumber(arr);
        }
    } 
    
    public static void duplicateNumber(int arr[]) 
    {
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {

            if(arr[i]==arr[j])
            {
                System.out.println(arr[i]);
            }
            
            }
        
        }
        
        

    }
}