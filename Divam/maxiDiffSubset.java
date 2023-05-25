/**Sample Input
4
5 8 -1 4
Sample Output
Maximum Difference = 18
 */

import java.util.*;
 
 class array{
    public static void main(String args[])
    {
        int arr[]={5,8,-1,4,8};
        int sump=0,sumn=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
            }
            if(arr[i]>0)
            {
                sump+=arr[i];
                
                
            }
            else
            {
                sumn+=arr[i];
            }
        }
        
        System.out.println(sump-sumn);
    }
 }
