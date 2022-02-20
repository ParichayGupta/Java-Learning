/*Pointer variable of super Class can hold the reference of object of sub Class
for example:-    A a= new A();
where "A a" is the reference variable, & "new A()" is the object*/

class A
{
}
class B extends A
{	
}
class C extends A
{
}
class Demo23
{
	static public void main(String []ab)
    {
		//case 1
		A a1=new A();//run
		
		//case 2
		A a2=new B();//run
		
		//case 3
		A a3=new C();//run
		A a4;
		
		//case 4
		a4= new A();//run
		
		//case 5
		B b1=new B();//run
		
		//case 6
		/*
		B b2=new A(); 'Error' because "A" is parent class and "B" is its child class and 
		                child class cannot be coverted to its parent class*/
		
		//case 7
		/*
		B b3=new C(); 'Error' because there is no realtion between "B" and "C"*/					
		
		//case 8
		B b4=new B();
		A a5= b4;//run
		
		//case 9
		/*
		A a6=new A(); 
		B b4=a6;	'Error' because "A" is parent class and "B" is its child class and 
		                child class cannot be coverted to its parent class*/
		
		//case 10				
        /*
		A a7=new A();
		B b5 =(B)a7;  'ClassCastException' because "A" is parent class of "B" 
		               So "Class A" A cannot be casted  to "Class B"
		/* At compile the Type iis checked,
        And At Runtime Object is checked*/
		
		//case 11
		/*
		A a8=new B(); 
		B b6=a8; 'Error' because "A" is parent class and "B" is its child class and 
		                child class cannot be coverted to its parent class*/
		
		//case 12
		A a9=new A();
		B b7= (B)a9;// run (type casting can be used in parent child relation)
		
		//case 13
		/*
		C c=new C(); 
		b b8=c; 'Error' because there is no realtion between "B" and "C"*/

		
		//case 14
		/*
		C c1=new C();
		B b9=(B) c1; 'Error' because there is no realtion between "B" and "C"
		               type casting is can only be used in parent child relation*/

		//case 15
		/*
		A a10=new C();
		B b10=(B)a10; 'ClassCastException' because "A" is parent class of "B" and "C" 
		               So "Class A" A cannot be casted  to "Class B"* or "Class C"/
		}
}
