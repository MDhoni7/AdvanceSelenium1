package blocks;

public class C {
static {
	System.out.println(1);
	C c=new C();
}
static {
	System.out.println(2);
	C c2=new C();
}
{
	System.out.println(3);
	
}
{
	System.out.println(4);
	
}
public static void main(String[] args) {
	
}
}
