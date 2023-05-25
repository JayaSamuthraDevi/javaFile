import java.util.*;
class pattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        //--------------------------------------------
        // for(int j=1;j<=a;j++){
        // for(int i=1;i<=a;i++)
        // {
        //     System.out.print(i);
        // }
        // System.out.println();
        // }

//         123456
// 123456
// 123456
// 123456
// 123456
// 123456
        //---------------------------------------------
        // for(int j=1;j<=a;j++){


        //      if(j%2!=0){
        //                 for(int i=1;i<=a;i++)
        //                 {
        //                  System.out.print(i);
        //                   }
        //                 }
        //     else{
        //          for(int i=a;i>0;i--)
        //          {
        //          System.out.print(i);
        //         }
        //     }
        //     System.out.println();
        // }

// 12345
// 54321
// 12345
// 54321
// 12345

        //-------------------------------------------
        //  for(int j=1;j<=a;j++){


        //      if(j%2!=0){
        //                 for(int i=1;i<=a;i++)
        //                 {
        //                    if(i%2!=0){
        //                  System.out.print(i);
        //                   }
        //                    System.out.print(" ");
        //                 }
        //      }
        //     else{
        //          for(int i=a;i>0;i--)
        //          {
        //             if(i%2!=0){
        //          System.out.print(i);
        //         }
        //          System.out.print(" ");
        //     }
        //     }
        //     System.out.println();
        // }

        //
// 1  3  5
// 5  3  1
// 1  3  5
// 5  3  1
// 1  3  5

    //----------------------------------

// for (int i=1;i<=a;i++)
// {
//      System.out.print(i);
//     for(int j=i+1;j<a;j++)
//     {
//         System.out.print(j);
//     }
//     System.out.println();
// }

// -------------------
// 5
// 1234
// 234
// 34
// 4
// 5
// ----------------

// for(int i=0;i<a;i++)
// {
//     for(int j=0;j<i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int k=a;k>i;k--)
//     {
//         System.out.print("*");
//     }
//      System.out.println();
// }

// --------------
// 5
// *****
//  ****
//   ***
//    **
//     *
// --------------------



//  for(int i=0;i<a;i++)
// {
//     for(int j=i;j<a-1;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();

// }

// -----------------------
// 5
// *****
// ****
// ***
// **
// *
// --------------------


// for(int i=0;i<a;i++)
// {
//     for(int j=0;j<i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int k=a;k>i;k--)
//     {
//         System.out.print("*");
//     }
  
//     for(int j=i;j<a;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// // ---------------

// 5
// **********
//  ********
//   ******
//    ****
//     **

// //---------------

// for(int i=0;i<a;i++)
// {
//     for(int j=0;j<i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int k=a;k>i;k--)
//     {
//         System.out.print("*");
//     }
  
//     for(int j=i;j<a-1;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }


// -------------
// 5
// *********
//  *******
//   *****
//    ***
//     *
// --------------

// for(int i=0;i<a;i++)
// {
//     for(int j=0;j<=i;j++)
//     {
//         System.out.print("*");
//     }
//     for(int k=i;k<a-1;k++)
//     {
//          System.out.print("#");
//     }
//     for(int k=i;k<a-1;k++)
//     {
//          System.out.print("#");
   
//     }
//     for(int j=0;j<=i;j++)
//     {
//         System.out.print("*");
//     }
//      System.out.println();
   
// }


//--------------------

// 2
// *##*
// ****
// 5
// *########*
// **######**
// ***####***
// ****##****
// **********

//------------------




for(int i=0;i<a;i++)
{
     for(int k=a;k>i;k--)
    {
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++)
    {
        System.out.print("*");
    }
   
    for(int j=0;j<i;j++)
    {
        System.out.print("*");
    }
  
    System.out.println();
}

// ---------------------

// 5
//      *
//     ***
//    *****
//   *******
// ---------------------
        }

    }

