package assignment3;

public class Student {
	
	String name;
	int age;
	char section;
	char gender;
	int subject1=0;
	int subject2;
	int subject3;
	int total;
	double average;
	public Student(String name,int age,char section,char gender,int subject1,int subject2,int subject3)
	{
		this.name=name;
		this.age=age;
		this.section=section;
		this.gender=gender;
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}
	
	
	public Student(String name,int age,char section,char gender,int subject2,int subject3)
	{
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.subject2=subject2;
		this.subject3=subject3;
		
	}
	void display() {
		System.out.println("name of the student is :"+name);
		System.out.println("Age of the student is :"+age);
		System.out.println("Section of the student is :"+section);
		System.out.println("Gender of the student is :"+gender);
		System.out.println("Subject1 marks of the student is :"+subject1);
		System.out.println("Subject2 marks of the student is :"+subject2);
		System.out.println("Subject3 marks of the student is :"+subject3);
		}
	int add(int a,int b,int c) {
			return a+b+c;
		}
		
	float average(int a, int b,int c)	{
		return (a+b+c)/3;
	}
		
	public static void main(String args[]) throws Exception
	{
		Student s1=new Student("rashi",24,'A','F',89, 95, 93);
		Student s2=new Student("adithi",23,'B', 'F', 0,78, 85);
		Student s3=new Student("jai",25, 'A', 'M', 0,78,92);
		s1.display();
		
		
		
		
		System.out.println("student1 sum of marks is:"+s1.add(89,95,93));
		System.out.println("student1 percentage is :"+s1.average(89,95,93));
		System.out.println("");
		s2.display();
		System.out.println("student2 sum of marks is:"+s2.add(0,78,85));
		System.out.println("student2 percentage is :"+s1.average(0,78,85));
		System.out.println("");
		s3.display();
		System.out.println("student3 sum of marks is:"+s1.add(0,78,92));
		System.out.println("student3 percentage is :"+s1.average(0,78,92));
		
		
		
		
	}
	int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	double avg(int x,int y,int z)
	{
		return (double)((x+y+z)/3);
	}
	
} 
		
	
