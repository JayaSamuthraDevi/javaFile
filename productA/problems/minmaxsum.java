import java.util.*;

class rock
{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);

int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
Arrays.sort(arr);
min(arr);


}
public static void min(int arr[])
{
    int min=0,max=0;
for(int i=1;i<arr.length;i++)
{
    max+=arr[i];
}
for(int i=0;i<arr.length-1;i++)
{
    min+=arr[i];
}

System.out.print(min+" "+max);
}

}