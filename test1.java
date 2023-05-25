
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target =sc.nextInt();
    int flag=0,j;
        for( j=0;j<n;j++)
        {
            if(target ==arr[j])
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            System.out.println(j);
        }
        else
        {
            System.out.println(-1);
        }
    
    


    }


}
