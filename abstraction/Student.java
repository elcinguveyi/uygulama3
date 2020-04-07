package abstraction;

public class Student extends Person {
	
	
	
	public Student(int id, String name, double credit, int age) {
		super(id, name, credit, age);
		
	}

	public void updateCredit(){
		setCredit(getCredit()-1.25);
	}

}
