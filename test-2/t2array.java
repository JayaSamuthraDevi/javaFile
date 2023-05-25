import java.util.*;
class test
{
    public static void main(String agrs[])

    {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        
    
        int arr[]=new int[r];
        for(int i=0;i<r;i++)
        {
          
            arr[i]=sc.nextInt();
            
        }
int count=0,a=0,s=0;
String temp="";
System.out.print("total Repeated elements: ");
        for(int i=0;i<r-1;i++)
        {
            for(int j=i+1;j<r;j++)
            {
                if(arr[i]!=s){
            if(arr[i]==arr[j])
            {
                    count++;
                     s=arr[j];
                    
                    temp=temp+" "+arr[j];
                    
                     
                  break;
            }
                }
            }
           
            
        }
System.out.println(count);
        
System.out.print("Repeated elements are: ");
System.out.println(temp);
    }
}