import java.util.*;
import java.io.*;
class A{
	void display()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valid Age ?");
		int age= sc.nextInt();
		if(age<18){ throw new InvalidAgeException("invalid age bcz is lessthe 18  : Min age "); }
		else if(age> 60 ){ throw new InvalidAgeException("invalid age bcz is greate  18 : Max age  "); }

		else{ System.out.println("Valid ");}
	}
}
class Demo23{
	public static void main(String args[]) {
		try{
			A a = new A();
			a.display();
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
	}	
}
class InvalidAgeException extends RuntimeException{
	InvalidAgeException(String msg){
		super(msg);
	}
}
