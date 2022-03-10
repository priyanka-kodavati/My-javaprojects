package assistedprojects;

public class Threadcreation {
	

		public static void main(String args[]) 
		{
			Thread1 t1=new Thread1();
			t1.start();
			
			
		}
		
	}

	class Thread1 extends Thread
	{
		
		public void run() 
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("creating thread");
			}

		}
		}
		
	

