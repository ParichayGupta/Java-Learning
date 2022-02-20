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
class Demo7
{
	public static void main(String args[])
	{
		A a1=new A();
		A a2=new A();
		a1.run();
		a2.run();
		
	}
}