class A extends Thread
{
	public void show()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo5
{
	public static void main(String args[])
	{
		A a=new A();
		a.show();
		for(int i=100;i<=110;i++)
		{
			System.out.println(i);
		}
	}
}