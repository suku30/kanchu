package hybrid.inh.pro;

public class Transport extends SupplyFood implements Farmer {

	@Override
	public void lemon() {
		System.out.println("lemon rice");
		
	}

	@Override
	public void oxygen() {
		// TODO Auto-generated method stub
		System.out.println("tree gives oxygen");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("good food");
		
	}
	private void cost() {
		// TODO Auto-generated method stub
		System.out.println("five");

	}
	public static void main(String[] args) {
		
		Transport t=new Transport();
		t.lemon();
		t.oxygen();
		t.food();
		t.cost();
		
	}

}
