class A
{
	A()
	{
		System.out.println("Hi A class xyz  ");
	}
	void display()
	{
		System.out.println("Hi A class Meyhod");
	}
}
class B
{
	B()
	{
		System.out.println("Hi B class  ");
	}
}
class Demo
{
	public static void main(String args[])
	{
		System.out.println("Hi Welcome to java ");
		A a = new A();
		a.display();
		a.display();
		a.display();
		B b = new B();
	}
}

