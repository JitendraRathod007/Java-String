class FirstLetterCapital
{
	public static void main(String args[])
	{
		String s1="I am Java Developer";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			sb.append(Character.toUpperCase(s2[i].charAt(0)));
			sb.append(s2[i].substring(1));

			sb.append(" ");
		}
		System.out.print(sb);
	}
}