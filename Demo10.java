

import java.util.Scanner;
class Emp
{
	Scanner sc = new Scanner(System.in);
	int id,age;
	String name;
	Emp()
	{
		System.out.println("Enter ID :"); id= sc.nextInt();
		System.out.println("Enter Name :");name= sc.next();
		System.out.println("Enter Age :");age= sc.nextInt();
	}
}
final class Clerk extends Emp
{
	int salary=20000;
	String desig="Clerk";
	Clerk()
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
	void raiseSalalary()
	{
	
	
	}
}
final class Manager extends Emp 
{
	int salary=90000;
	String desig="Manager";
	Manager()
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
}
 final class Tester extends Emp
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
}
 final class Developer extends Emp
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
}
class  Demo10
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
			System.out.println("3 ) Exit ");
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
				System.out.println("Thank you ");				
			}	

		}while(ch1!=3);	
	}
}

































