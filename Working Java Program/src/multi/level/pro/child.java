package multi.level.pro;

public class child extends Parent {
	private void biscuit() {
		System.out.println("cholocate biscuit");

	}
	public static void main(String[] args) {
		child c=new child();
		c.love();
		c.property();
		c.biscuit();
	}

}
