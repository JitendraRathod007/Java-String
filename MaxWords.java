class MaxWords
{
	public static void main(String args[])
	{
		String s1="MY name is Jitendra I am Engineer";
		String s2[]=s1.split(" ");
		int max=0;
		for(int i=0;i<s2.length;i++)
		{
			if(max<s2[i].length())
			{
				max=s2[i].length();
			}
		}
		System.out.println(max);
		for(int i=0;i<s2.length;i++)
		if(max==s2[i].length())
		System.out.print(s2[i]+" ");
	}
}