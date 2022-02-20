class A
{
	A(int x, int y)
	{
		System.out.println(x+y);
	}
}
class Demo
{
	public static void main(String args[])
	{
		A a=new A();
		A a1=new A(10,25);
	}	
}