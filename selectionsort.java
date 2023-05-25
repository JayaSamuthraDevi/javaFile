import java.util.Scanner;
class s{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int i;
         for( i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
        for(int j=0;j<a-1;j++)        //////////////
        {
            int min =j;
            for(int k=j+1;k<a;k++)    ///////////
            {
                if(arr[k]<arr[min])       ///////
                {
                    min=k;
                }
                
            }
            int temp =arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
        }
        
        for(int e : arr)
        {
            System.out.print(e+" ");
        }

    }
}