// encupulated class ------- Bean class ----------- POJO class (Plane old java object )
class Emp
{
	private int id;
	private String name;
	void setId(int id)
	{
		this.id= id; 
	}
	void setName(String name)
	{
		this.name= name;
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
}
class Demo19
{
	public static void main(String  args[])
	{
		Emp e = new Emp();
		e.setId(100);e.setName("Thanesh");
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}
}