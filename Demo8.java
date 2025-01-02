// parent calsss --- super class ---- base class 
// child -----------sub -------------dervied class 
class Parent
{
	int site = 5;
	String car= "BMW";
	int mony=200000;
	void display()
	{
		System.out.println(site);
		System.out.println(car);
		System.out.println(mony);
	}
}
class Child   extends Parent
{
	void display()
	{
		System.out.println(site);
		System.out.println(car);
		System.out.println(mony);
	}
}
class  Demo8
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.display();
	}
}