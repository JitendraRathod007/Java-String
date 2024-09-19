class PracRev
{
	public static void main(String args[])
	{
		String s1="jitendra Rathod Naiknagar";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			StringBuilder temp =new StringBuilder(s2[i]);
			sb.append(temp.reverse()+" ");
		}

		System.out.print(sb);
	}
}