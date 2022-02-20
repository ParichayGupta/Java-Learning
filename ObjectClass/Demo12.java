//hashCode() Method


class Employee
{
	int id;
	String Address;
	Employee(int id,String Address) //Parameterised Constructor
	{
		this.id=id;
		this.Address=Address;
	}
} 
class Demo12
{
	public static void main(String []ab)
	{
	Employee e=new Employee(101,"AAA");	
	System.out.println(e); //ClassNme@HashCode <Employee@4cc77c2e>
	System.out.println(Integer.toHexString(e.hashCode())); //HashCode in Hexadecimal Format <4cc77c2e>
	System.out.println(e.hashCode()); //Hashcode in Decimal Format <1288141870>
	}
}	
	