class ReplaceVowelsByNo
{
	public static void main(String args[])
	{
		String s1="International";
		StringBuilder sb=new StringBuilder(s1);
		String s2="AEIOUaeiou";
		int count=0;
		for(int i=s1.length()-1;i>=0;i--)
		   if(s2.contains(String.valueOf(s1.charAt(i))))
		   {
                         sb.deleteCharAt(i);
                         sb.insert(i,++count);
		  }

		System.out.println(sb);
	}
}