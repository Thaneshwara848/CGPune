import java.util.Scanner;
class A
{
	Scanner sc = new Scanner(System.in);
	void prog1()
	{
		System.out.println("Enter Name :");
		String name= sc.next();
	}

}
public class Demo5
{
	public static void main(String args[])
	{
		A a = new A();
		a.prog1();
	}	
}



