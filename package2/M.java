package package2;

	public class M {
		private  int s=9;
		long e=256445;
		protected  float y=50.7f;
		public void methodpublic(){
			System.out.println("private value of int s="+s);
			System.out.println("protected value of float y="+y);
			System.out.println("default value of long e="+e);
		}
		public void publicmethodM(){
			System.out.println("This is package1 M class public method");
		}
		protected void protectedmethodM(){
			System.out.println("This is package1 M class protected method");
		}
	    void defaultmethodM(){
	    	System.out.println("This is package1 M class default method");
		}
	    private void privatemethodM(){
	    	System.out.println("This is package1 M class private method");
	    }
	}

