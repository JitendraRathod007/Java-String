class FirstLetterSmall
{
	public static void main(String args[])
	{
		String s1="I Am Java Developer";
		String s2[]=s1.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			sb.append(Character.toLowerCase(temp.charAt(0)));
			sb.append(temp.substring(1));
			sb.append(" ");
		}
		System.out.print(sb);
	}
}