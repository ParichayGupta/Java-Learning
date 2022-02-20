//toString() Method
//The HexaDecimalNumber shows the reference of the Object

class Employee
{
	void show()
	{
		System.out.println("Softwaves");
	}
	
} 
class Demo9
{
	public static void main(String []ab)
	{
	Employee e=new Employee();	
	Employee e1=new Employee();	
	System.out.println(e); //Employee@4cc77c2e (ClassName@Reference Of The Object e in hexadcimal form) 
	System.out.println(e1); //Employee@61064425 (ClassName@Reference Of The Object e1 in hexdecimal form)	
	}
}