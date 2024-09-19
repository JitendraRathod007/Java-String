class Prac
{
public static void main(String args[])
{
	String s1="India";
	StringBuilder sb=new StringBuilder(s1.substring(1,s1.length()));
  sb.append(s1.charAt(0));
	System.out.println(sb);
}
}
