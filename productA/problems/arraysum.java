import java.util.*;
class s {
    public static void main(String[] arga)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {

        }



        int a[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
           if(a[i]<10)
           {
            System.out.print("S"+" ");
           }
           else{
            System.out.print("D"+" ");
           }
        }

    }
    
}


//SAMPLE INPUTS:  1 2 3 4 5   6 7 8 9 10 
// SAMPLE OUTPUT1: 7 12 24 40 45                
//    S-Single digits S D D D D                          D-Double digit 
 
// SAMPLE OUTPUT2:  0 1 2 1 0      E-Even
//   N O E O N  N-Both    O-Odd