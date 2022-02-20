//toString() Method

//whenever a object is displayed by default toString() method of object class is called internally

//toString() method is called via Object class because by default Object Class is extended by any class

class A
{
	void show()
	{
		System.out.println("Class A");
	}
	
}	
class B extends A
{
	void show()
	{
		System.out.println("Class B");
	}
}
class Demo6
{
	public static void main(String []ab)
	{
		B b=new B();
		b.show();
	}
}