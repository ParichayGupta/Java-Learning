//toString() Method

//whenever a object is displayed by default toString() method of object class is called internally

class Employee
{
	void show()
	{
		System.out.println("Show Method");
	}
	
}	
class Demo5
{
	public static void main(String []ab)
	{
		Employee e=new Employee();
		System.out.println(e);//Employee@hexadecimalNumber
		System.out.println(e.toString());//Employee@samehexadecimalmNumber
	}
}