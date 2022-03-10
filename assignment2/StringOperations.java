package assignment2;
public class StringOperations
{
	String name;
	public StringOperations(String name)
	{
		this.name=name;
		
	}
	public static void main(String[] args) 
	{
		StringOperations s1=new StringOperations(" ");
		s1.output("she was feeing the little rabbit with an apple");
	}
	void output(String name)
	{
		int count=0;
		
		for(int i=0;i<name.length()-1;i++)
		{
			if(name.charAt(i)==name.charAt(i+1))
			{
				count++;
			}
		}
		System.out.println("Double Letter Sequence Count = " + count);
	}
}
