//Overrided equals() method
class Employee
{
	int id;
	String Address;
	Employee(int id,String Address)
	{
		this.id=id;
		this.Address=Address;
	}
	public boolean equals(Object o)
	{
		return true;
	}
}

class Demo21
{
	static public void main(String []ab)
	{
		Employee e1=new Employee(101,"AAA");
		Employee e2=new Employee(102,"BBB");
		Employee e3=new Employee(101,"AAA");
		Employee e4=e1;
		
		
		System.out.println(e1.equals(e2));//true
		System.out.println(e1.equals(e3));//true
		System.out.println(e1.equals(e4));//true
		
	}
}
/*Employee class does have an overrided equals() method of object class. 
   in which the returned value is true ,
   so in each case the equals method is called the output will be true*/