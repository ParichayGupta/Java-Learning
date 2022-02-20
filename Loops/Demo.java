//Basic While Loop
class Demo
{
	public static void main(String args[])
	{
		int i=1;
		
		while(i<=10)
		{
			System.out.print(i++ +" ");//1 2 3 4 5 6 7 8 9 10
		}
		i=1;
		System.out.println(" ");
		
		i=1;
		while(i<=10)
		{
			System.out.print(++i +" ");//2 3 4 5 6 7 8 9 10 11
		}
		System.out.println(" ");
		
		i=1;
		while(++i<=10)
		{
			System.out.print(i++ +" ");//2 4 6 8 10
		}
		System.out.println("");
		System.out.println(i); //12
		
		System.out.println(" ");
		
		i=1;
		while(i++<=10)
		{
			System.out.print(++i +" ");//3 5 7 9 11
		}
		System.out.println("");
		System.out.println(i); //12
		
		System.out.println(" ");
		
		i=1;
		while(++i<=10)
		{
			System.out.print(++i +" ");//3 5 7 9 11
		}
		System.out.println("");
		System.out.println(i); //12
		
		System.out.println(" ");
		
		i=1;
		while(i++<=10)
		{
			System.out.print(i++ +" ");//2 4 6 8 10
		}
		System.out.println("");
		System.out.println(i); //12
		
		System.out.println(" ");
		
	}
}