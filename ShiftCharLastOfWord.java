class ShiftCharLastOfWord
{
	public static void main(String args[])
	{
		String s1="I am java Developer My dream to get jo in IT";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		StringBuilder last =new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			last.append(s2[i].charAt(0));
			sb.append(s2[i].substring(1));
			sb.append(" ");
		}
		sb.append(last);
		System.out.println(sb);
	}
}