package blocks;

public class A {
	static {
		System.out.println("SB-1");
	}
	{
		System.out.println("NSB-1");
	}
	static {
		System.out.println("SB-2");
	}
	{
		System.out.println("NSB-2");
	}
	static {
		System.out.println("SB-3");
	}
	{
		System.out.println("NSB-3");
	}
	public static void main(String[] args) {
		A a=new A();
		System.out.println("hii");
		A a2=new A();
		A a3=new A();
		
	}

}
