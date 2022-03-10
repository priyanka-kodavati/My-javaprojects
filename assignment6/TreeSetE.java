package assignment6;
import java.util.TreeSet;
public class TreeSetE 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("html");
		t.add("css");
		t.add("javaScript");
		t.add("jquery");
		t.add("bootstrap");
		t.add("java");
		
		System.out.println("before operations :"+t);
		t.remove("javascript");
		t.remove("java");
		System.out.println("after removal of two :"+t);
		t.add("sql");
		t.add("python");
		t.add("angular");
		System.out.println("after the adding three:"+t);
		System.out.println("checking java is part or not? :"+t.contains("java"));
		t.removeAll(t);
		System.out.println("after last operation:"+t);
		
	}

}