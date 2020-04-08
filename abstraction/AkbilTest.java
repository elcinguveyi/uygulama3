package abstraction;

public class AkbilTest {

	public static void main(String[] args) {
		Person person[] = new Person[4];
		person[0] = new Student(1234, "Ali Demir", 10, 15);
		person[1] = new Student(2345, "Veli Bakır", 10, 19);
		person[2] = new Employee(3456, "Ayşe Çakır", 10, 59);
		person[3] = new Retired(4567, "Aylin Takır", 10, 70);
		
		System.out.println("Kayıtlı Kullanıcılar:");
		for(Person p: person)
			p.printInfo();
		
		System.out.println("Otobüse Biniş-1");
		for(Person p: person){
			p.updateCredit();
			p.printInfo();
		}
		
		/* bu kısımda yaş artışından sonra manuel olarak nesnelerin tip dönüşümü yapılıyor.
		System.out.println("Yaş Artışı");
		for(Person p:person){
			p.addAge();
			p.printInfo();
		}
		
		person[1] = new Employee(person[1].getId(), person[1].getName(), person[1].getCredit(), person[1].getAge());
		person[2] = new Retired(person[2].getId(), person[2].getName(), person[2].getCredit(), person[2].getAge());
		*/
		
		System.out.println("Yaş Artışı ve Tip Değişimi");
		for(int i=0; i<4 ; i++){
			person[i].addAge();
			if( (person[i] instanceof Student && person[i].getAge()<20) || 
			    (person[i] instanceof Employee && person[i].getAge()<60) || 
			    (person[i] instanceof Retired && person[i].getAge()>=60))
				    person[i].printInfo();
				
			else if( person[i] instanceof Student && person[i].getAge()>=20 ){
				 person[i] = new Employee(person[i].getId(),person[i].getName(),person[i].getCredit(),person[i].getAge());
				    person[i].printInfo();
				
			}
			else if( person[i] instanceof Employee && person[i].getAge()>=60 ){
				person[i] = new Retired(person[i].getId(),person[i].getName(),person[i].getCredit(),person[i].getAge());
				person[i].printInfo();
				
			}
		}
		
		System.out.println("Otobüse Biniş-2");
		for(Person p: person){
			p.updateCredit();
			p.printInfo();
		}
		
	}
	

}
