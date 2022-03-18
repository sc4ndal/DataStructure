package week3;

class TestEx{
	public int a, b, c;
	public static int d = 0;
	
	public TestEx(int a, int b, int c) {
		//super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "TestEx [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public static void hihello() {
		System.out.println("hello, Welcome!");
	}


}

public class Test {
	static int cnt = 0;
	public static void testtest() {
		System.out.println("testing");
		cnt++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		TestEx one = new TestEx(1,2,3);
		TestEx two = new TestEx(4,5,6);
		TestEx three = new TestEx(7,8,9);
		TestEx.hihello();
		System.out.println(one.a);
		System.out.println(two.a);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(TestEx.d);
		one.d++;
		System.out.println(one.d);
		System.out.println(two.d);
		*/
		testtest(); testtest(); testtest(); testtest(); testtest();
		System.out.println(cnt);
	}

}
