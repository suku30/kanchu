package multi.level.pro;

public class Parent extends GrandParent {
	public void property() {
	System.out.println("my property");

	}
	public static void main(String[] args) {
	Parent p=new Parent();
	p.property();
	p.love();
	

}
}
