import java.util.*;
import java.io.*;
class A
{
	void display()
	{
		String name="Rakesh";
		System.out.println("Name :"+name.length());
		//name=null;
		//System.out.println("Name :"+name.length());// NullPointerException
		int arr[]={5,3,4,6,7,8};
		//System.out.println(arr[7]);ArrayIndexOutOfBoundsException
		//String id= "100A"; NumberFormatException
		String id="100";
		int uid=Integer.parseInt(id);
		System.out.println(uid);
	}
}
class Demo22
{
	public static void main(String args[]) 
	{
		A a = new A();
		a.display();
	}	
	
}