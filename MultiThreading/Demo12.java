class A implements Runnable
{
	A()
	{
		Thread t1=new Thread();
		t1.start();
		Thread t2=new Thread();
		t2.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo12
{
	public static void main(String args[])
	{
		A a=new A();
	}
}