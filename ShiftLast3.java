class ShiftLast3
{
	public static void main(String args[])
	{
		String s1="India";
		StringBuilder sb=new StringBuilder(s1.substring(1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}