class NoAtVowels
{
	public static void main(String args[])
	{
		String s1="International";
		StringBuilder sb=new StringBuilder();
		String s2="AEIOUaeiou";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))

			   sb.append(++count);

			 else

			    sb.append(s1.charAt(i));
	}
	System.out.println(sb);
}
}