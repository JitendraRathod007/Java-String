import java.util.Arrays;
class ReverseStringBySwap
{
	public static void main(String args[])
	{
		String s1="jitendra";
		char s2[]=s1.toCharArray();

		for(int i=0;i<s2.length/2;i++)
		{
			char temp=s2[i];

			s2[i]=s2[s2.length-1-i];
			s2[s2.length-1-i]=temp;
	     }

	    // for(int i=0;i<s2.length;i++)
	    // System.out.print(s2[i]+" ");
	    System.out.print(Arrays.toString(s2));
	}
}