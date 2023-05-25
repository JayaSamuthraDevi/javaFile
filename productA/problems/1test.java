import java.util.*;
class encrp
{
	public static void main(String srgs[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		char[] arr=new char[10];
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			char a=str.charAt(i);
			
			while(i!=str.length()-1 && str.charAt(i)==str.charAt(i+1) )
			{
				count++;
				i++;
			}
			
			arr[j]=a;
			j++;
			arr[j]=(char)(count+'0');
			j++;
		}
		for(int i=j-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}