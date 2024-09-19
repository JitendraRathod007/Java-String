class ReversBySwap
{
	public static void main(String args[])
	{
		String s1="India";
		char charArray[]=s1.tocharArray();
		char temp=" ";
		for(int i=0;i<charArray.length()/2;i++)
		{
			temp=s1.charArray[i];
			charArray[i]=charArray[charArray.length()-1-i];
			charArray[charArray.length()-1-i]=temp;
		}
		for(int i=0;i<charArray.length();i++)
			System.out.print(charArray);
		}
	}