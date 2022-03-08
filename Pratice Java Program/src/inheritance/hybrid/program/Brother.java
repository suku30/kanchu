package inheritance.hybrid.program;

public class Brother extends Child implements Parent {
	public static void main(String[] args) {
    Brother s=new Brother();
		s.jewels();
		s.property();
		s.cholocate();
		s.money();
	}
private void jewels() {
	System.out.println("Diamond");

}
@Override
public void money() {
	System.out.println("money");
	
}
@Override
public void cholocate() {
	System.out.println("cholocate");
	
}
@Override
public void property() {
	System.out.println("money");
	
}

	
	

}
