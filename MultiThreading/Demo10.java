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
class Demo10b
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.start();
	}
}