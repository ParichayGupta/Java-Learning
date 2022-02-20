class A extends Thread
{
		public void run()
		{
			System.out.println(Thread.currentThread());
		}
}
class Demo17b
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