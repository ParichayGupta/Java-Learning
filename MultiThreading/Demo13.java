class A
{
	A()
	{
		MyDemo m1=new MyDemo();
		m1.start();
		MyDemo2 m2=new MyDemo2();
		m2.start();
	}
}
class MyDemo extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class MyDemo2 extends Thread
{
	public void run()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo13
{
	public static void main(String args[])
	{
		A a=new A();
	}
}