
class Student
{
	String name;
	
	public Student()
	{
		
	}
	public Student(String name)
	{
		this.name = name;
	}
}

public class Main {

	
	public static void main(String[] args)
	{
		Student student = new Student("test");
		
		Class cls = student.getClass();
		
		System.out.println(cls.getName());
		System.out.println(cls.getSuperclass());
		
		StringBuffer sb = new StringBuffer();
		sb.append("asd");
		System.out.println(sb);
		
		
		
	}
}
