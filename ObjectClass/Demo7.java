//toString() Method

//whenever a object is displayed by default toString() method of object class is called internally

/*toString() method is accessed via Object class because by default Object Class
 is extended by any class*/

/* if any class is not extended by any other class then it is by default extended by Object Class
 either Directly or Indirectly*/

// We can Override toString() method 

//Return type of toString method is "String".

class Employee
{
	void show()
	{
		System.out.println("Softwaves");
	}
	public String toString() //overrided toString() method
	{
		return "Ram";
	}
} 
class Demo7
{
	public static void main(String []ab)
	{
	Employee e=new Employee();	
	System.out.println(e); //Ram
	System.out.println(e.toString());//Ram
//In the above progeam the overrided toString() method is called.	
	}
}