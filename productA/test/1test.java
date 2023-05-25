import java.util.*;
class t{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str="{([(<{}[<>[]}>{[]{[(<()>";
        //String str="[({(<(())[]>[[{[]{<()<>>[(()[<>])]({[<{<<[]>>({([(<{}[<>[]}>{[]{[(<()>(((({<>}<{<{<>}{[]{[]{}[[<[([]))<([[{}[[()]]][{[{({}]{}}([{[{{{}}([]{<[[]]>}<{[{[{[]{()[[[][<(<(<(<{}))><([]([]()<{([([[(<>()){}]>(<<{{<{([{{}}[<[[[<>{}]]]>[]]";

        char arr[]=str.toCharArray();
        
         check(arr);
        
        
    }
    static void check(char arr[])
    {
        int a1=0,a2=0,b1=0,b2=0,c1=0,c2=0,d1=0,d2=0;

        for(char x:arr)
        {
            if(x=='(')
            {
                a1++;
            }
            if(x==')')
            {
                a1--;
            }
            if(x=='{')
            {
                b1++;
            }
            if(x=='}')
            {
                b1--;
            }
            if(x=='[')
            {
                c1++;
            }
            if(x==']')
            {
                c1--;
            }
            if(x=='<')
            {
                d1++;

            }
            if(x=='>')
            {
                d1--;
            }
        }




//         if(a1!=0)
//         {
//             System.out.print(a1+" ");
//         }
// if(b1!=0)
//         {
//             System.out.print(b1+" ");
//         }
//         if(c1!=0)
//         {
//             System.out.print(c1+" ");
//         }
//         if(d1!=0)
//         {
//             System.out.print(d1+" ");
//         }
       

       System.out.print(a1+" ");
       System.out.print(b1+" ");
        System.out.print(c1+" ");
        System.out.print(d1+" ");
    }
}