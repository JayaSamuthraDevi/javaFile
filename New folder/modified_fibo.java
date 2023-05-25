import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER t1
     *  2. INTEGER t2
     *  3. INTEGER n
     */

    public static BigInt fibonacciModified(int t1, int t2, int n) {
    // Write your code here
    BigInteger t3 = new BigInteger("0");  
    if(n==1)
    {
        return t1;   
    }
    if(n==2)
    {
        return t2;
    }
    if(n>2)
    {
        for(int i=2;i<n;i++)
        {
        t3=t1+(t2*t2);
        //System.out.println(t3);
        int temp=t1;
        t1=t2;
        t2=t3;
        }
        return t3;
    }
    return 0;
    }

}
