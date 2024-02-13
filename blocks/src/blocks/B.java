package blocks;

public class B {
	static {
		System.out.println("SB-1");
	}
	{
		B b6=new B();
	}
	static {
		B b5 = new B();
	}

	{
		System.out.println("NSB-2");
	}
	static {
		B b4 = new B();
	}
	{
		B b7=new B();
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println("hii");
		B b2 = new B();
		B b3 = new B();
	}
}
