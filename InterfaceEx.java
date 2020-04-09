
public class InterfaceEx {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.method1();
		ch.method2(); //default erişimli method
		ch.method3();
		IClass2.method4(); //static erişimli method
		ch.method5();

	}

}

/*-------------------------------------------------------------*/
interface IClass{
	public void method1();
	default void method2(){
		System.out.println("IClass sınıfında method2 çalıştı.");
	}
	
}
/*-------------------------------------------------------------*/
interface IClass2 extends IClass{
	public void method3();
	static void method4(){
		System.out.println("IClass2 sınıfında method4 çalıştı.");
	}
	
}
/*-------------------------------------------------------------*/
class Parent{
	public void method5(){
		System.out.println("Parent sınıfında method5 çalıştı.");
	}
}
/*-------------------------------------------------------------*/
class Child extends Parent implements IClass, IClass2{

	@Override
	public void method3() {
		System.out.println("Child sınıfında method3 çalıştı.");
		
	}

	@Override
	public void method1() {
		System.out.println("Child sınıfında method1 çalıştı.");
		
	}
	
}

