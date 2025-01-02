abstract class Bank
{
	abstract void withdraw();
	abstract void ATM();
	
}
class Sbi  extends Bank
{
	void withdraw()
	{
		System.out.println("Hi Wiothdraw logic ,pin , amont ");
	}
	 void ATM()
	{
		System.out.println("Hi ATM , AB card ");
	}
}
class Axis extends Bank
{
	void withdraw()
	{
		System.out.println("Hi Wiothdraw logic ,amount , pin ");
	}
	void ATM()
	{
		System.out.println("Hi ATM , XYZ card ");
	}
}
class Demo17
{
	public static void main(String args[])
	{
		//Bank a = new Bank();a.withdraw();
		Sbi s = new Sbi();s.withdraw();
		Axis a = new Axis();a.withdraw();
	}
}


















