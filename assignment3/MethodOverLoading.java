package assignment3;
public class MethodOverLoading {

		 
		
		int add(int a,int c)
		{
			return a+c;
		
		
		}
		double areaCircle(int r) {
			return 3.14*r*r;
			
		}
		int areaRectangle(int l,int b) {
		return l*b;
	} 
		public static void main(String args[]) {
			
			  MethodOverLoading ob=new MethodOverLoading();
			 
			   int x1=ob.add(4,5);
			   double x2=ob.areaCircle(4);
			   int x3=ob.areaRectangle(5,20);
			   System.out.println("addition of a and c:"+x1);
			   System.out.println("area of the circle is:"+x2);
			   System.out.println("area of the rectangle is:"+x3);
			   
		}
		  
	}


