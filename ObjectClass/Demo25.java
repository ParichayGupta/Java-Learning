class A 
{
	
	void show()
	{
		System.out.println("Class A show method");
	}
}
class B extends A 
{
	void show1()
	{
		System.out.println("Class B show method");
	}
}

class Demo25
{
	public static void main(String []ab)
	{
		A a=new B();
		a.show();
        a.show1();		
	}
	
}