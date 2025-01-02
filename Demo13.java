class Emp
{
	Emp()
	{
		System.out.println("Emp()");
	}
	Emp(int a)
	{
		System.out.println("Emp(int a)");
	}
	Emp(int a,String name)
	{
		System.out.println("Emp(int a,String name)");
	}
}
// same const name + diff par + muiltple time + in a smae class = C O L 
class Demo13
{
	public static void main(String args[])
	{
		Emp e= new Emp();
		Emp e1= new Emp(100);
		Emp e2= new Emp(100,"Thanesh");
	}
}
