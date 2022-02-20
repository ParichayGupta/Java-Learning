class A extends Thread
{
	public void start()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo8
{
	public static void main(String args[])
	{
		A a1=new A();
		A a2=new A();
		a1.start();
		a2.start();
		
	}
}