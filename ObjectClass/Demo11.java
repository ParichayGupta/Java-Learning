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
	public String toString()
	{
			return "id = "+id+"\t Address = "+Address;
	}	
} 
class Demo11
{
	public static void main(String []ab)
	{
	Employee e=new Employee(101,"AAA");	
	Employee e1=new Employee(101,"AAA");	
	Employee e2=new Employee(103,"CCC");
	System.out.println(e); //The Overrided toString method is called in corresopnding with each object
	System.out.println(e1);
	System.out.println(e2);
	}
}	
	