package inheritance.hybrid.program;

public interface Parent extends GrandParent {
	void money();
	default void property() {
		// TODO Auto-generated method stub
	System.out.println("the father gives money to child");
	
	}

}
