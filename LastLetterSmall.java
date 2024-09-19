class LastLetterSmall
{
	public static void main(String args[])
	{
		String s1="WELCOME TO PUNE AND BEST OF LUCK FOR YOUR NEXT STEP";
		String s2[]=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
				sb.append(temp.substring(0,temp.length()-1));
			sb.append(Character.toLowerCase(temp.charAt(temp.length()-1)));

			sb.append(" ");
		}
		System.out.print(sb);
	}
}