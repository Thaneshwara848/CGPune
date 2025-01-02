
class Bank
{
	Bank()
	{
	}
	public  int roi()
	{
		return 10; 
	}
}
class Sbi extends Bank
{
}
class Axis extends Bank
{
	public  int  roi()
	{
		return 12;
	}	
}
// same method name + diff par + muiltple time + in a smae class = M O L 
class Demo14
{
	public static void main(String args[])
	{
		Sbi s = new Sbi();
		System.out.println(s.roi());
		Axis a = new Axis();System.out.println(a.roi());
	}
}


OOPS

		class & obj 

		Inheriatce : 
				single 
				multio level 
				Hir
				Hibrid 
				Muiltip e

		Polymorhism 
			Compile time 
					Over loding 
							construct 
							method 
					same cost name+ diff par + mulitpe time + in same class 
			Run TIme 
					over riding 
							constructro : no 
							method : yes 
					same par + same method name + same signature in child class 























