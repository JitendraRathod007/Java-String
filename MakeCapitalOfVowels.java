 class MakeCapitalOfVowels
 {
	 public static void main(String args[])
	 {
		 String s1="Hello i am java Developer";
		 String s2="AEIOUaeiou";
		 StringBuilder sb=new StringBuilder();
		 for(int i=0;i<s1.length();i++)
		 {
			 if(s2.contains(String.valueOf(s1.charAt(i))))
			    sb.append(Character.toUpperCase(s1.charAt(i)));
			  else
			      sb.append(s1.charAt(i));
	     }
		     System.out.println(sb);
	 }
 }