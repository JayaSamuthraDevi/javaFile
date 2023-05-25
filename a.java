import java.util.Scanner;
class c{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            a2[i]=sc.nextInt();
        }
        int temp=0,max=0,maxi=0;
        for(int j=0;j>n;j++)
        {
           max= a1[j]-a2[j];
           
           temp+=max;


           if(temp>maxi)
           {
            maxi=temp;
           }
       
             

        }
        
System.out.println(maxi);

    }
}