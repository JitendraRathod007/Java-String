class SecondMaxWords
{
	public static void main(String args[])
	{
		String s1=" My name is Jitendra I am a Engineerr";
		String s2[]=s1.split(" ");
		int max=0;
		int smax=0;
		for(int i=0;i<s2.length;i++)
		{
			if(max<s2[i].length())
			{
				smax=max;
				max=s2[i].length();
			}
		}
		System.out.println(smax);
		for(int i=0;i<s2.length;i++)
		if(smax==s2[i].length())
		System.out.print(s2[i]+" ");
	}
}