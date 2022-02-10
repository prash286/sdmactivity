package classloaders;

public class TestInstanceInitBlock {
	private int i;

	public static void main(String[] args) {
		TestInstanceInitBlock t1=new TestInstanceInitBlock();
		TestInstanceInitBlock t2=new TestInstanceInitBlock(10);
	}
	{
		System.out.println(1);
	}
	public TestInstanceInitBlock() {
		System.out.println(2);
	}
	public TestInstanceInitBlock(int i) {
		super();
		System.out.println(3);
		this.i = i;
	}
	

}
