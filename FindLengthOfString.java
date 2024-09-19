import java.lang.StringBuilder;
class FindLengthOfString
{
	public static void main(String args[])
	{
		String s1="hallo i am java developer";
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			//if(s2[i].length()!=0)
			count++;
		}

		System.out.println(count);
	}
}