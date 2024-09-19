class SmallWords
{
	public static void main(String args[])
	{
		String s1=" my name is jitendra rathod am a Engineer";
		String s2[]=s1.split(" ");
        int max=0;
		for(int i=0;i<s2.length;i++)
		{

			if(small>s2[i].length())
			{
				small=s2[i].length();
			}
		}
		System.out.println(small);
	}
}