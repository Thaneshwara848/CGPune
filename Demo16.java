//final class Car
class Car
{
	int price = 500000;
	final  int speed= 200;
	//final void gare()
	 void gare(){
		System.out.println("4 gares ");
	}
}
class Bmw extends Car{
	void gare(){
		System.out.println("Non gares ");
	}
}
class Maruthi extends Car{
}
class Demo16{
	public static void main(String args[]){
		Car  a = new Car();
		System.out.println("Speed :"+a.speed);
		//a.speed=2000; we cant re asign the value 
		//System.out.println("Speed :"+a.speed);
		Maruthi m = new Maruthi();m.gare();
	}
}
Access modifiers : 
			private  public	protected			default 
non accces modifier : 
			final static abstarct 
			



