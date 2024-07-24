


class Test
{
	private String name;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Test t = new Test();
		
		t.setName("asd");
		System.out.println(t.getName());
	}
}
