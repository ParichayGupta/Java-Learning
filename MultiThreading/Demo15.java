class A extends Thread
{
	String name;
	A(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(name+"="+i);
		}
	}
}
class Demo15
{
	public static void main(String args[])
	{
		A a1=new A("Ram");
		A a2=new A("Sita");
		a1.start();
		a2.start();
	}
}