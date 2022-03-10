package assignment5;
public abstract class MNC
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println(" method m3 in Mnc class");
	}
	public MNC() 
	{
		
	}
	public static void main(String[] args)
	{
		MNC x1=new Hello();
		Infosys x2=new Hello();
		x2.m1();
		x2.m2();
		x2.m3();
		x1.m1();
		x1.m2();
		x1.m3();
		
		
	}

}
abstract class Infosys extends MNC
{
	void m1()
	{
		System.out.println(" method m1 of infosys class");
	}
}
class Hello extends Infosys
{
	void m4()
	{
		System.out.println(" method m4 of Hello class");
	}
	void m1()
	{
		System.out.println(" method m1 of Hello class");
	}
	void m2()
	{
		System.out.println("method m2 of the Hello class");
	}
}
