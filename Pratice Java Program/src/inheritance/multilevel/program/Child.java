package inheritance.multilevel.program;

public class Child implements Parent,Parent2  {
	public static void main(String[] args) {
		Child c=new Child();
		c.toy();
		c.property();
		c.money();
	}

	private void toy() {
		System.out.println("toy");
		
	}

	@Override
	public void property() {
		// TODO Auto-generated method stub
		System.out.println("My property");
		
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("Money");
		
	}
	
	

}
