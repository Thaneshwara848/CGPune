class Parent
{
	Parent()
	{
		System.out.println("Parent class ");
	}	
	void display()
	{
		System.out.println("Hi Parent clss display()");
	}
}
class Child  extends Parent
{
	Child()
	{
		System.out.println("Child class ");
	}
}
class GChild extends Child
{
	GChild()
	{
		System.out.println("Grand Child");
	}
}
class  Demo9
{
	public static void main(String args[])
	{
		//Parent p = new Parent();
		//Child c = new Child();
		GChild gc= new GChild();
	}
}

































