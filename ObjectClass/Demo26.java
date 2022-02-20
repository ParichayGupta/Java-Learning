//Method Hiding
class A 
{
	static void show()
	{
		System.out.println("Class A show method");
	}
}
class B extends A 
{
	static void show()
	{
		System.out.println("Class B show method");
	}
}

class Demo26
{
	public static void main(String []ab)
	{
		A a=new B();
		a.show();		
	}
	
}

/*Static mmeans compile time binding(Compile Time Polymorphism).. So that it is decided that class A's 
 show method will be called*/