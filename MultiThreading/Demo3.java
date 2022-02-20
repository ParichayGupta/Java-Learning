class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo3
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
		for(int i=100;i<=110;i++)
		{
			System.out.println(i);
		}
	}
}