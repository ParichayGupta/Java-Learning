//equals() Method

class Demo16
{
	static public void main(String []ab)
	{
		String s1=new String("Ram");
		String s2=new String("Ram");
		System.out.println(s1==s2); //False
	}
}
/*Output is false because "==" operator compares the reference of the object.

And each object has a different reference*/