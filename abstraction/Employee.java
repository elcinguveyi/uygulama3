package abstraction;

public class Employee extends Person {
	
	
	
	public Employee(int id, String name, double credit, int age) {
		super(id, name, credit, age);
		
	}

	public void updateCredit(){
		setCredit(getCredit()-2);
	}

}