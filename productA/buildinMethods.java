import java.util.*;
class array
{
public static void main(String args[])
{
int arr[]={1,2,3};
int a[]={1,2,3};
int ar1[][]={{1,2},{3,4}};
int ar2[][]={{1,2},{3,4}};
int arr1[]={1,2,3,4,5,6};
int arr2[]={3,5,2,6,1,7,4};
char[] s={'b','d','e','a','c'};
//comparing  values for string 
System.out.println("string :"+arr.equals(a));

//comparing  values for one D Arrays
System.out.println("one D Arrays :"+Arrays.equals(arr,a));

//comparing  values for two D Arrays
System.out.println("two D Arrays :"+Arrays.deepEquals(ar1,ar2));

//binarysearch
int n=2;//elemnt to find out
System.out.println("binarysearch :"+Arrays.binarySearch(arr,n)+" position");

//binary search with fromindex and toIndex
System.out.println("binarysearch :"+Arrays.binarySearch(arr1,0,5,n)+" position");

//sorting int 
Arrays.sort(arr2);
System.out.println("sorting ");
for(int i:arr2)
    {
     System.out.print(i);
    }

System.out.println();
//sorting char

 for(char c:s)
     {
        System.out.println(c);
    }

    //to char Array
   
        String ss = "Geeks for Geeks";
        
        String[] strn=ss.split("e",3);

        for(String as : strn)
        {
            System.out.print(as+" ");
        }
        //print char array

    //    char[] gfg = ss.toCharArray();

    //     for (int i = 0; i < gfg.length; i++)
    //     {
    //         System.out.print(gfg[i]+" ");
    //     }
}
}
