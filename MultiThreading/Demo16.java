class A extends Thread
{
	String name;
	A(String name)
	{
		this.name=name;
	}
	public void show()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(name+"="+i);
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class Demo16
{
	public static void main(String args[])
	{
		A a1=new A("Cut Ticket ");
		A a2=new A("Show Ticket");
		a1.show();
		a2.show();
	}
}