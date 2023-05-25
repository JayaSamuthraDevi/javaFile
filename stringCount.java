import java.util.Scanner;
class count{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();

        char a[]=new char[s.length()];
        
s.toLowerCase();
        
        for(int i=0;i<s.length();i++)
        {
            a[i]=s.charAt(i);
          
        }
        
int count=0;
for(int i=0;i<s.length();i++)
{
        if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u'))   // ||(a[i]=='A')||(a[i]=='E')||(a[i]=='I')||(a[i]=='O')||(a[i]=='U')
        {
                count++;
        }
}
        System.out.println("Number of Vowels :"+count);


int count1=0;
for(char c :a)
{
    count1++;
}

System.out.println("Number of char in string: "+count1);
    }
    
}
