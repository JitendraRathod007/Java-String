class FindLengthPrac
{
	public static void main(String args[])
	{
		String s1="My Dream is to get job in It Sector this is my Childhood dream";
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			count++;
			System.out.print(s2[i]+ " ");
		}
		System.out.println();
		System.out.print(count);
	}
}