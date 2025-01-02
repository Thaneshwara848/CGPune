

import java.util.Scanner;
interface Company
{
	void cab();
}
abstract class Emp
{
	Scanner sc = new Scanner(System.in);
	int id,age;
	String name;
	int salary;
	String desig;
	Emp()
	{
		System.out.println("Enter ID :"); id= sc.nextInt();
		System.out.println("Enter Name :");name= sc.next();
		System.out.println("Enter Age :");age= sc.nextInt();
	}
	void display()
	{
		
		System.out.println("Enter ID :"+id); 
		System.out.println("Enter Name :"+name);
		System.out.println("Enter Age :"+age);
		System.out.println("Enter Salary :"+salary);
		System.out.println("Enter Desig:"+desig);
	}
	abstract void raiseSalary();

}
class Clerk extends Emp implements Company 
{	 
	Clerk()
	{
		salary=20000;
	 	desig="Clerk";	
	}
	void raiseSalary()
	{
		salary = salary + 10000;
	}
	public void cab(){ System.out.println(" u can use comepanmy bus ");}
}
class Manager extends Emp implements Company
{
	int salary=90000;
	String desig="Manager";
	Manager()
	{
	}
	void raiseSalary()
	{
		salary = salary + 40000;
	}
	public void cab(){ System.out.println(" You  can use comepanmy  Cars ");}

	
}
class Tester extends Emp
{
	int salary=30000;
	String desig="Tester";
	Tester()
	{
	}
	void display()
	{
		
		System.out.println("Enter ID :"+id); 
		System.out.println("Enter Name :"+name);
		System.out.println("Enter Age :"+age);
		System.out.println("Enter Salary :"+salary);
		System.out.println("Enter Desig:"+desig);
	}
	void raiseSalary()
	{
		salary = salary + 20000;
	}

}
class Developer extends Emp
{
	int salary= 40000;
	String desig="Developer";
	Developer()
	{
	}
	void display()
	{
		
		System.out.println("Enter ID :"+id); 
		System.out.println("Enter Name :"+name);
		System.out.println("Enter Age :"+age);
		System.out.println("Enter Salary :"+salary);
		System.out.println("Enter Desig:"+desig);
	}
	void raiseSalary()
	{
		salary = salary + 30000;
	}

}
class  Demo15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch1,ch2=0;
		Clerk c= null;Developer d= null;Manager m= null; Tester t= null;
		do{
			System.out.println("=============Enter tghe CHice==========");
			System.out.println("1 ) Create ");
			System.out.println("2 ) Display ");
			System.out.println("3 ) Raise Salary  ");

			System.out.println("4 ) Exit ");
			ch1= sc.nextInt();
			if(ch1==1)
			{
				do{
					System.out.println("	1 ) Clerk ");
					System.out.println("	2 ) Developer ");
					System.out.println("	3 ) Manager ");
					System.out.println("	4 ) Tester ");
					System.out.println("	5 ) Exit ");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						c = new Clerk();
					}
					if(ch2==2){ 
						d =  new Developer();
					}
					if(ch2==3)
					{
						m = new Manager();
					}
					if(ch2==4)
					{
						t = new Tester();
					}
				}while(ch2!=5);
				
			}	
			if(ch1==2)
			{
				do{
					System.out.println("=======Whom to Display=======");
					System.out.println("	1 ) Clerk ");
					System.out.println("	2 ) Developer ");
					System.out.println("	3 ) Manager ");
					System.out.println("	4 ) Tester ");
					System.out.println("	5 ) Exit ");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						c.display();
					}
					if(ch2==2){ 
						d.display();

					}
					if(ch2==3)
					{
						m.display();

					}
					if(ch2==4)
					{
						t.display();

					}


				}while(ch2!=5);
				
			}	
			if(ch1==3)
			{
				do{
					System.out.println("=======Whom to Raise Salary =======");
					System.out.println("	1 ) Clerk ");
					System.out.println("	2 ) Developer ");
					System.out.println("	3 ) Manager ");
					System.out.println("	4 ) Tester ");
					System.out.println("	5 ) Exit ");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						c.raiseSalary();
						System.out.println("Salary Raised.....!");
					}
					if(ch2==2){ 
						d.raiseSalary();
						System.out.println("Salary Raised.....!");


					}
					if(ch2==3)
					{
						m.raiseSalary();
						System.out.println("Salary Raised.....!");

					}
					if(ch2==4)
					{
						t.raiseSalary();
						System.out.println("Salary Raised.....!");

					}


				}while(ch2!=5);
				
			}	

			if(ch1==4)
			{
				System.out.println("Thank you ");				
			}	

		}while(ch1!=4);	
	}
}



