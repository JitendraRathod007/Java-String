class ReplaceVowelsFromLastNo
{
	public static void main(String args[])
	{
		String s1="international";
		String s2="AEIOUaeiou";
		StringBuilder sb=new StringBuilder();
		int count=0;
		System.out.println(count);
		for( int j=0;j<s1.length();j++)
		{
			char ch=s1.charAt(j);
			if(ch==a||ch==e||ch==i||ch==o||ch==u)
			  {
				  count++;
			  }
		  }
		  System.out.println(count);

		for(int i=0;i<s1.length();i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
			sb.append(--count);
			else
			sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	}
}