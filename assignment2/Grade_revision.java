package assignment2;

public class Grade_revision {
	String name;
	int bas;
	int expn;
	double inc;
	double nbas;
	public Grade_revision() 
	{
		name="";
		bas=0;
		expn=0;
		nbas=0.0;
		inc=0.0;
	}
	
	void accept()
	{
		bas=150000;
		expn=5;
		name="rashi";
	}
	void increment()
	{
		if (expn <=3)
		{
			inc = 1000 + (bas * 0.1);
		}
        else if ( expn <= 5)
        {
        	inc = 3000 + (bas * 0.12);
        }
        else if (expn <= 10)
        {
        	inc = 5000 + (bas * 0.15);
        }
        else
        {
        	inc = 8000 + (bas * 0.2);
        }
		nbas=bas+inc;
	}
	public void display() 
	{
      System.out.println("The Name is: " + name);
      System.out.println("The Basic salary amount is: " + bas);
      System.out.println("The Experience in years: " + expn);
      System.out.println("The Increment is: " + inc);
      System.out.println("The New Basic salary amount is: " + nbas);
	}
	public static void main(String[] args)
	{
		Grade_revision ob = new Grade_revision();
	      ob.accept();
	      ob.increment();
	      ob.display();
	}
	
}
