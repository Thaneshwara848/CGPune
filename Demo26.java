import java.util.*;
class Demo26{
	public static void main(String args[]){	
		int a[]={1,2,34,5,6,8,9};
		for(int i=0;i<a.length;i++){
			System.out.println("I :"+a[i]);
		}		
		System.out.println("=========== for each loop");
		for(int x:a){
			System.out.println(x);
		}
		System.out.println("====================");
		int ar[]= new int[5];
		ar[0]=100;	ar[1]=200;	ar[2]=300;	ar[3]=400;	ar[4]=500;
		for(int i=0;i<ar.length;i++){
			System.out.println("I :"+ar[i]);
		}		
		System.out.println("=========== for each loop");
		Scanner sc = new Scanner(System.in);		
		System.out.println("How many Elemenmts ? ");
		int size= sc.nextInt();
		int arr[]= new int[size];
		for(int j=0;j<size;j++){
			arr[j]=sc.nextInt();
		}					
		System.out.println("=========");
		for(int i=0;i<arr.length;i++){
			System.out.println("I :"+arr[i]);
		}
	}
}



