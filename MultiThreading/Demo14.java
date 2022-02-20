class A
{
	A()
	{
		new Thread()
		{
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
				}
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
				}
			}
		}.start();
	}
}
class Demo14
{
	public static void main(String args[])
	{
		A a=new A();
	}
}