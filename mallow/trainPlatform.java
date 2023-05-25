import java.util.*;
class Train{
    public static void main(String[]args){
        int count=1;
    Scanner sc= new Scanner (System.in);
    int n=sc.nextInt();
    double arr[]=new double[n];
    double dep[]=new double[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextDouble();
        dep[i]=sc.nextDouble();
    }
    for (int i=0;i<n-1;i++) {
    if(dep[i]>=arr[i+1]){
        count++;
    }
    }
    
    System.out.print(count);
    }

}