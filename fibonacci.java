import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
      // Scanner sc =new Scanner(System.in);
      // int a=sc.nextInt();

        // int i,n1=0,n2=1,n3;
        // System.out.print(n2);

        // for(i=1;i<=a;i++)
        // {
        //     n3=n1+n2;
        //      System.out.print(" "+n3);
        //      n1=n2;
        //      n2=n3;
        // }
        Map<Integer, Long> memo = new HashMap<>();
        int n = 7;
        long fib = fib(n, memo);
        System.out.println(fib);

    }
    public static long fib(int n, Map<Integer, Long> memo) {
        if (memo.containsKey(n)) 
        {
            return memo.get(n);
        }
        if (n <= 2) {
            
            return 1;
        }
        long fib = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, fib);
        return fib;
    }
}

