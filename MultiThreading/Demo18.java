class B extends Thread
{
		public void run()
		{
			System.out.println(Thread.currentThread());
		}
}
class A extends Thread
{
		public void run()
		{
			B b=new B();
			b.start();
			System.out.println(Thread.currentThread());
		}
}
class Demo18
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
		System.out.println(Thread.currentThread());
	}
}



//Output [main,5,main] :- [ThreadName,Priority,ThreadGroup]
//Output [Thread-0,5,main] :- [ThreadName,Priority,ThreadGroup]