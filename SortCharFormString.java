import java.util.Arrays;
class SortCharFormString
{
	public static void main(String args[])
	{
		String s1="India";
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		s1=new String(c);
		System.out.println(s1);
	}
}
