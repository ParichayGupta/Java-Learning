class Employee
{
	int id;
	String Address;
	Employee(int id,String Address)
	{
		this.id=id;
		this.Address=Address;
	}
}

class Demo19
{
	static public void main(String []ab)
	{
		Employee e1=new Employee(101,"AAA");
		Employee e2=new Employee(102,"BBB");
		Employee e3=new Employee(101,"AAA");
		Employee e4=e1;
		
		System.out.println(e1==e2);//false
		System.out.println(e1==e3);//false
		System.out.println(e1.equals(e2));//false
		System.out.println(e1.equals(e3));//false
		System.out.println(e1.equals(e4));//true
		
	}
}
/*Employee class doesvnot have equals() method.
  So the equals() method of the Object class will be called, which compares the reference of the object.
  
  Since each object has different reference,So output is false.
  
  but in case of e4- we have given the reference of e1 to e4 (e4==e1),
  So both e1 and e4 are pointing the same reference. */