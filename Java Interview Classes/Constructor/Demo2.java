class A
{
	A()
	{
		System.out.println("Class A Constructor");
	}
	void show()
	{
		A();
		System.out.println("Class A Method");
		
	}
}
class Demo
{
	public static void main(String args[])
	{
		A a=new A();
		a.show();
	}	
}