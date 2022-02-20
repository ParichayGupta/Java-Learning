//toString() Method
//The HexaDecimalNumber shows the reference of the Object

class Employee
{
	int id;
	String Address;
	Employee(int id,String Address) //Parameterised Constructor
	{
		this.id=id;
		this.Address=Address;
	}
	void show()
	{
		System.out.println("id = "+id);
		System.out.println("Address = "+Address);
	}	
} 
class Demo10
{
	public static void main(String []ab)
	{
	Employee e=new Employee(101,"AAA");	
	Employee e1=new Employee(101,"AAA");	
	Employee e2=new Employee(103,"CCC");
	e.show();
	e1.show();
	e2.show();
	}
}	
	