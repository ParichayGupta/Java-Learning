class A extends Thread
{
		public void run()
		{
			System.out.println(Thread.currentThread());
		}
}
class Demo20
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
		a.setName("Ram");
		a.setPriority(10);
		Thread.currentThread().setName("Sita");
		System.out.println(Thread.currentThread());
	}
}


