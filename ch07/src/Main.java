
class Test{
	int a;
	void fire()
	{
		System.out.println("파이어");
	}
}

class Test2 extends Test {
	int b;
	void fire2()
	{
		System.out.println("파이어2");
	}
}

public class Main {
	public static void main(String[] args)
	{
		Test t = new Test2();
		t.fire();
		if(t instanceof Test2) {
			((Test2) t).fire2();
		}
	}
}
