/*Pointer variable of super Class can hold the reference of object of sub Class
for example:-    A a= new A();
where "A a" is the reference variable, & "new A()" is the object*/

class A
{
	A()
	{
		System.out.println("Constructor");
	}
	void show()
	{
		System.out.println("Show Method");
	}
}
class Demo22
{
	static public void main(String []ab)
	{
		A a=new A();// Constructor
		a.show();// Show method
	}
}
