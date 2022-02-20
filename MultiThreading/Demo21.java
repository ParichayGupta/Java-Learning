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
class Demo21
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
		a.setPriority(11);
		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}


