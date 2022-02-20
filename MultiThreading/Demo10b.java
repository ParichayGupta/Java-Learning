class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo11
{
	public static void main(String args[])
	{
		A a1=new A();
		Thread t1=new Thread(a1);
		t1.start();
		for(int i=100;i<=110;i++)
		{
			System.out.println(i);
		}
	}
}