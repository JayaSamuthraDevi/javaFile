import java.util.*;

class l
{
    
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();

        char arr[]=s.toCharArray();

       check(arr);
    }

    static void check(char arr[])
    {
       // char vowel[]=new char[arr.length];
       ArrayList<Character> vowel =new ArrayList<>();
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if((arr[j]=='a')||(arr[j]=='e')||(arr[j]=='i')||(arr[j]=='o')||(arr[j]=='u'))
            {
                vowel.add(arr[j]);
                arr[j]=' ';
                i++;
            }
        }
        int y=1;
        for(int k=0;k<arr.length;k++)
        {
            
            if(arr[k]==' ')
            {
                arr[k]=vowel.get(vowel.size()-y);
                y++;
            }

        }
      
        for(char r:arr)
        {
            System.out.print(r);
        }


    }
}
/* 
hello
holle

leetcode
leotcede
*/