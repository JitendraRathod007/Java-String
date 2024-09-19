class ReverseStringLine
{
	public static void main(String args[])
	{
		String s1=" I am Java Developer";
		System.out.println(s1.length());
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			StringBuilder temp=new StringBuilder(s2[i]);
			sb.append(temp.reverse());

		}

		System.out.print(sb);
	}
}