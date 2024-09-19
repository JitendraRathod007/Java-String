class CountDigitFromString
{
	public static void main(String args[])
	{
		String s1="welcome Jitendra In 2024 new year will be 2025";
		int count =0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}