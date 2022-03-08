package hybrid.inh.pro;

public interface Farmer extends Tree {
	void food();
	
	@Override
	default void oxygen() {
		// TODO Auto-generated method stub
		System.out.println("oxygen");
		
	}
	
	
		
	}


