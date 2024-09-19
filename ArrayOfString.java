class ArrayOfString
{
    public static void main(String args[])
    {
        String s1 = "jitendra";
        for (int i = 0; i < s1.length(); i++)
        {
            System.out.print(s1.charAt(i) + " ");

        }
        System.out.println();
        System.out.println(s1.indexOf('i'));

    }
}