package inheritance.singlelevel.program;

public class Staff extends Office {
	private void work() {
		System.out.println("Hardwork");

	}
	public static void main(String[] args) {
		Staff d=new Staff();
		d.work();
		d.salary();
		d.timing();
	}

}
