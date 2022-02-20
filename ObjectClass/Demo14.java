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
		
	}
} 
class Demo14
{
	public static void main(String []ab)
	{
	Employee e=new Employee(101,"AAA");	
	Employee e1=new Employee(102,"BBB");	
	System.out.println(e); //Employee@65 (65 is hexadecimal value of 101)
	System.out.println(e1); //Employee@66 (66 is hexadecimal value of 102)
	}
}	
/* in the above example the overrided toString() method is called, 
	in which we have called the internal working of the toString() method of the object class...