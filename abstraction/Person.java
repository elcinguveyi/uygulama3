package abstraction;

public abstract class Person {
	private int id,age;
	private String name;
	private double credit;
	
	public Person(int id, String name, double credit, int age){
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public abstract void updateCredit();
	
	public void printInfo() {
		System.out.printf("TC Kimlik No:%d \t Ad-Soyad:%s \t Bakiye:%,.2f \t Yaş:%d \n",id,name,credit,age);
		
	}
	
	public void addAge(){
		setAge(getAge()+1);
		
	}
	
	
}
