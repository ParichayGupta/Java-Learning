/*getClass() Method*/


class Employee
{
	void show()
	{
		System.out.println("Show Method");
	}
	
}	
class Demo4
{
	public static void main(String []ab)
	{
		Employee e=new Employee();
		e.show(); // Show Method
		System.out.println(e);//Employee@Hexadecimal Number (className@HexadecimalNumber)
		System.out.println(e.getClass()); //CLass Employee
		System.out.println(e.getClass().getName()); //Employee
		
	}
}