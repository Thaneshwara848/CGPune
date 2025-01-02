class Parent
{
	int x=1000;
}
class Child   extends Parent
{
	int x =100;
	void display(int x)
	{
		System.out.println("Child local X :"+x);		// 10 
		System.out.println("Child globle  X :"+this.x);	// 100 	
		System.out.println("Parent X :"+super.x);	// 1000 

	}
}
class  Demo11
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.display(10);
	}
}