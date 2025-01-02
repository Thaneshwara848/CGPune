
class A{
	int a;
	A(){}
	void abc(){}
}
class A1{}
//class A2 extends A1,A2{}
abstract class B{
	int a;
	B(){}
	void abc(){}
	abstract void xyz();
}
abstract class B1{}
abstract class B2{}
//abstract class B3 extends B1,B2{}
interface I {
	int a=100;
	//I(){}
	  void abc();
	 void xyz();
	//void atoz(){}

}
interface J{}
interface K extends I,J{}
class Demo18{
	public static void main(String args[]){
		A a = new A();
		//B b = new B();
		//I  i = new I();
	}
}