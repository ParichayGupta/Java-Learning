//Method Hiding
class A 
{
	int x=10;
}
class B extends A 
{
	int x=100;
}
class C extends B 
{
	int x=1000;
}

class Demo27
{
	public static void main(String []ab)
	{
		A a=new A();
		A a1=new B();
		A a2=new C();
		System.out.println(a.x);  //10		
		System.out.println(a1.x);//10			
		System.out.println(a2.x);//10					
	}
	
}
// compile time binging me super class ki priority sbse jyada hoti hai to usi ki method ya variable call hota hai
// in case of variables always Complie time Binding will work..
/*Static mmeans compile time binding(Compile Time Polymorphism).. So that it is decided that class A's 
 show method will be called*/
 