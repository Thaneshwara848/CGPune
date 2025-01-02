import java.util.Scanner;
class A
{
	int id;
	String name;
	A()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID : ");
		id=sc.nextInt();

		System.out.println("Enter name : ");
		 name=sc.next();
			//age
			// saalry	
			// desig
	}
	void display()
	{
		
		System.out.println("ID  :"+id);
		System.out.println("Name :"+name);
	}
}
class Demo2
{
	public static void main(String args[])
	{
		A a = new A();
		a.display();
	}
}