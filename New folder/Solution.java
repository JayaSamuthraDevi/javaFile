import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        int n = sc.nextInt();

        BigInt result = Result.fibonacciModified(t1, t2, n);
        
        
        System.out.println(result);
    }
}
