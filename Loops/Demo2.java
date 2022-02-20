//Basic Do-While Loop
class Demo2
{
	public static void main(String args[])
	{
		int i=1;
		do
		{
			System.out.print(i +" ");//1 2 3 4 5 6 7 8 9 10
			i++;
		}while(i<=10);
		System.out.println(" ");
		System.out.print(i);// 11
		System.out.println(" ");
		
		i=1;
		do
		{
			System.out.print(i +" ");//1 2 3 4 5 6 7 8 9 10
			++i;
		}while(i<=10);
		System.out.println(" ");
		System.out.print(i); //11
		System.out.println(" ");
		
		i=1;
		do
		{
			System.out.print(i +" ");//1 2 3 4 5 6 7 8 9 10 11
		}while(i++<=10);
		System.out.println(" ");
		System.out.print(i); //12
		System.out.println(" ");
		
		i=1;
		do
		{
			System.out.print(i +" ");//1 2 3 4 5 6 7 8 9 10   
		}while(++i<=10);
		System.out.println(" ");
		System.out.print(i); //11
		System.out.println(" ");
		
	}
}