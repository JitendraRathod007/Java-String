 class StringConstantPoolHashcode
 {
	 public static void main(String args[])
	 {
		 String s1="India";
		 String s2=new String("Bharat");
		 String s3=new String("India");
		 String s4="Bharat";
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 System.out.println(s3.hashCode());
		 System.out.println(s4.hashCode());
	 }
 }