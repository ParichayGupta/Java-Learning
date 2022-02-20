//OBJECT Class
class Employee
{
	void show()
	{
		System.out.println("Show Method");
	}
	
}	
class Demo3
{
	public static void main(String []ab)
	{
		Employee e=new Employee();
		e.show(); // Show Method
		System.out.println(e);//Employee@Hexadecimal Number (className@HexadecimalNumber)
	}
}