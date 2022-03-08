package Hierarchical.inh.pro;

public class Child2 extends Child1 {
	public void toy() {
		System.out.println("toy");

	}
	public static void main(String[] args) {
		
	
	Child2 b=new Child2();
	b.toy();
	b.dress();
	b.chol();

}
}