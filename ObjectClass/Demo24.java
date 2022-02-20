class A 
{
	void show()
	{
		System.out.println("Class A show method");
	}
}
class B extends A 
{
	void show()
	{
		System.out.println("Class B show method");
	}
}

class Demo24
{
	public static void main(String []ab)
	{
		A a=new B();
		a.show();// Class B show method
	}
	
}

//All methods in java are vritual by default