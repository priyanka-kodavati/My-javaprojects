package assignment3;

public class CalculateArea {

	double rad;
	int len;
	int bre;
	int sidelen;
	public CalculateArea()
	{
		System.out.println("calculating area of different shapes");
	}
	public CalculateArea(double radius)
	{
		rad=radius;
		
	}
	public CalculateArea(int len,int bre)
	{
		this.bre=bre;
		this.len=len;
		
	}
	public CalculateArea(int side)
	{
		sidelen=side;
	}
	double circleArea(double x)
	{
		return 3.14*x*x;
	}
	double squareArea(int s)
	{
		return (double)s*s;
	}
	int rectangleArea(int x,int y)
	{
		return x*y;
	}
	public static void main(String[] args) throws Exception
	{
		CalculateArea a1 =new CalculateArea();
		CalculateArea circle=new CalculateArea(2.5);
		CalculateArea square=new CalculateArea(4);
		CalculateArea rectangle=new CalculateArea(9,4);
		System.out.println("area of square is :"+square.squareArea(square.sidelen));
		System.out.println("area of rectangle is :"+rectangle.rectangleArea(rectangle.bre,rectangle.len));
		System.out.println("area of circle is "+circle.circleArea(circle.rad));
	}
	
}
