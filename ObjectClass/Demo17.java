//equals() Method

class Demo17
{
	static public void main(String []ab)
	{
		String s1=new String("Ram");
		String s2=new String("Ram");
		System.out.println(s1.equals(s2)); //True
	}
}
/*Output is true because equals()method of "String class" compares the content inside an object.
And both the Strings have same content

String class overrride the equals() method 
so its defination is changed from the equals() method of Object class*/