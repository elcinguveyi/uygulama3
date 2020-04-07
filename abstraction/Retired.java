package abstraction;

public class Retired extends Person {
	
	
	
	public Retired(int id, String name, double credit, int age) {
		super(id, name, credit, age);
		
	}

	public void updateCredit(){
		setCredit(getCredit()-0.50);
	}

}