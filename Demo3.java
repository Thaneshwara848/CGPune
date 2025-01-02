import java.util.Scanner;
class A
{
	Scanner sc = new Scanner(System.in);
	void prog1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(" I :"+i);
		}
	}
	void prog2()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(" I :"+i);
			}
		}

	}
	void prog3()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==1)
			{
				System.out.println(" I :"+i);
			}
		}

	}
}
public class Demo3
{
	public static void main(String args[])
	{
		A a = new A();
		//a.prog1();
		System.out.println("=============== Even Number only =========");
		//a.prog2();
		System.out.println("=============== odd number only =========");
		
		a.prog3();
	}	
}