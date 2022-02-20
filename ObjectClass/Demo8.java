//toString() Method

class Employee
{
	void show()
	{
		System.out.println("Softwaves");
	}
	public String toString() //overrided toString() method
	{
		return ""+getClass().getName();
	}
} 
class Demo8
{
	public static void main(String []ab)
	{
	Employee e=new Employee();	
	System.out.println(e); //Employee
	System.out.println(e.toString());//Employee
	
/*In the above progeam the overrided toString() method is called and in this method
 we have returned getClass() method*/	
	}
}