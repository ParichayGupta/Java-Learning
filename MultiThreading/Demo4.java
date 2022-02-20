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
class Demo4
{
	public static void main(String args[])
	{
		for(int i=100;i<=110;i++)
		{
			System.out.println(i);
		}
		A a=new A();
		a.start();
	}
}