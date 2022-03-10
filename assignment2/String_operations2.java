package assignment2;

public class String_operations2 {
		String word;
		public static void main(String args[])
		{
			String_operations2 s1=new String_operations2();
			s1.formNewWord("World Health Organization");
			
		}
		void formNewWord(String w)
		{
			String word = " " + w.charAt(0);
		       int len = w.length();
		       
		       for (int i = 0; i < w.length()-1; i++)
		       {
		           char c = w.charAt(i);
		           if (c == ' ')
		           {
		        	   word += w.charAt(i + 1);
		           }
		       }
		       System.out.println("The first letter of every word  is:"+word);
		 }
}
