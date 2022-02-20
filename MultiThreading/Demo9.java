class A extends Thread
{
}
class Demo9
{
	public static void main(String args[])
	{
		A a1=new A();
		A a2=new A();
		a1.start();
		a2.start();
		
	}
}