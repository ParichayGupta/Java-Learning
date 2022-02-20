class A
{
	void show1()
	{
		System.out.println("Show1");
	}
	A a=new A();
	static void show2()
	{
		a.show1();
		System.out.println("Show2");
		
	}
}
class Demo4
{
	public static void main(String args[])
	{
	
		A.Show2();
	}	
}