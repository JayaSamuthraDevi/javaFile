// import java.util.Scanner;
// class a{
//     public static void main(String args[])
//     {
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.printf("%-15d%d",a,b);
//     }
// }
import java.util.Scanner;
class TestClass {
    public static void main(String args[] )  {
    
    Scanner sc = new Scanner(System.in);

    int T=sc.nextInt();

    while(T-->0)
    {
        int num =sc.nextInt();

        int arr[]=new int[num];

        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }

        int a,b,c=0,flag=0;
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
            a=(arr[i])&(arr[j]);
            b=(arr[i])|(arr[j]);
            c=a^b;
            if((c<a)&&(a<b))
            {
                flag=1;
                break; 
           
            }
             
            }
        }
        if(flag==1)
        {
            System.out.println(c);
        }
        
        
    }


    }
    
    
    


}

      