package blocks;

public class Count {
public static void main(String[] args) {
	int n=1,count=0;
	while(n>0)
	{
		count++;
		n=n/10;
	}
	System.out.println(count);
}
}
