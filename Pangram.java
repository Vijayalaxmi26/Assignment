public class Pangram 
{
	public static void allLetters(String str)
	{
		str = str.toLowerCase();
	    boolean allLetterPresent = true;
	    for (char ch = 'a';ch <='z';ch++)
		{
		  if (!str.contains(String.valueOf(ch)))
		  {
           allLetterPresent=false;
           break; 
		   }
		}
        if (allLetterPresent)
            System.out.println("pangram String");
        else
          System.out.println("Not a pangram String");
	}
        public static void main(String []args)
		{
         String str = "Abcdefghijklmnopqrstuvwxyz12";
         allLetters(str);
		}
}