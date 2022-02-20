class A
{
	int x=10;
}
class B extends A
{
	int x=500;
	
	void show1()
	{
		System.out.println("x="+x);
		System.out.println("x="+super.x);
	}
}
class Demo
{
	public static void main(String []ab)
	{
		B b=new B();
		b.show1();
		
	}
}