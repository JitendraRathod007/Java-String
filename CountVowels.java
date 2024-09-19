class CountVowels
{
	public static void main(String args[])
	{
		String s1="Education";
		int count=0;
		int consonant;

		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				count++;

			}
		}
		consonant=s1.length()-count;
		System.out.println(count);
		System.out.println(consonant);


	}
}