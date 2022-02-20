//equals() Method

class Demo18
{
	static public void main(String []ab)
	{
		StringBuffer s1=new StringBuffer("Ram");
		StringBuffer s2=new StringBuffer("Ram");
		System.out.println(s1==s2);//False
		System.out.println(s1.equals(s2)); //False
	}
}
/*Output is false in both case because 
equals() method i not overridden in StringBuffer class,

So the equals() method of the Object class is called here .
equals method of the Object class also compares the Reference of the object.
and "==" operator alse compares the reference of the object 
so the output will be false for both the cases.*/