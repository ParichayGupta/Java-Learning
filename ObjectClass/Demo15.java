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
		return getClass().getName()+"@"+hashCode();
	}
} 
class Demo15
{
	public static void main(String []ab)
	{
	Employee e=new Employee(101,"AAA");	
	Employee e1=new Employee(102,"BBB");	
	System.out.println(e); //Employee@101 
	System.out.println(e1); //Employee@102 
	}
}	
/* in the above example the overrided toString() method is called, 
	in which we have called the toString() method of the object class 
	but the hashcode is in decimal format */