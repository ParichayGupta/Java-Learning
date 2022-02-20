class Employee
{
	int id;
	String Address;
	Employee(int id,String Address) //Parameterised Constructor
	{
		this.id=id;
		this.Address=Address;
	}
	public int hashCode()
	{
		return id;
	}
	public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
		return getClass().getName()+"@"+hashCode();
	}
} 
class Demo13
{
	public static void main(String []ab)
	{
	Employee e=new Employee(101,"AAA");	
	Employee e1=new Employee(102,"BBB");	
	System.out.println(e); //Employee@65 (65 is hexadecimal value of 101)
	System.out.println(e1); //Employee@66 (66 is hexadecimal value of 102)
	}
}	
// in the above example the toString() method is called by default....	