package assistedprojects;

public class Constructors {

      int id;
		String name;
		Constructors(){
			int id;
			String name;
			}
		void display() {
			System.out.println(id+" "+name);
			}
		Constructors(int i,String n)
		{
		id=i;
		name=n;
		}
		public static void main(String[] args){
			Constructors a=new Constructors();
			Constructors b=new Constructors();
			a.display();
			b.display();
			Constructors c=new Constructors(1,"karthik");
			Constructors d=new Constructors(2,"Rashi");
			c.display();
			d.display();
		}
	}