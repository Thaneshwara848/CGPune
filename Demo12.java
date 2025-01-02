class A
{
	static int t=1000;
	static void abc()
	{
		System.out.println("Hi A class ");
	}	
}
class  Demo12
{
	
	public static void main(String args[])
	{
		//A a = new A();
		//a.abc();
		A.abc();				// classname.
		System.out.println(A.t);

	}
}