import java.util.ArrayList;

public class Agg {
	public static void main(String[] args) {
		Classroom sinif = new Classroom();
		Student s1 = new Student("01","Ali");
		Student s2 = new Student("02","Alp");
		Student s3 = new Student("03","Ece");
		
		sinif.studentAdd(s1);
		sinif.studentAdd(s2);
		sinif.studentAdd(s3);
		
		System.out.println(sinif);
		System.out.println(s2);
		
		sinif = null;
		System.out.println(sinif);
		System.out.println(s2);
	}
}

class Classroom{
	ArrayList<Student> students = new ArrayList<Student>();
	public void studentAdd(Student st){
		students.add(st);
	}
	
	@Override
	public String toString() {
		String str="";
		for(Student s : students)
			str = str + "Öğrencinin adı: "+s.getName()+" Öğrencinin Numarası: "+s.getId()+"\n";
		return str;
	}
	
	
	
}

class Student{
	private String id, name;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		
		return "Öğrenci No: "+getId();
	}
	public Student(String id, String name){
		this.id = id;
		this.name = name;
	}
}