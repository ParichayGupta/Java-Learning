Object Class



1. Which is the most super class of java? 
Ans. Object class is the most super class of Java

2. How many methods does the Object Class have ?
Ans. 12

3. out of 12 methods, How many of them user can access?
Ans. 11

4. What are the 12 methods of Object Class ?
Ans.
	1. getClass()
	2. toString()
	3. hashCode()
	4. equals()
	5. finalize()
	6. clone()
	7. wait()
	8. wait()
	9. wait()
	10. notify()
	11. notifyAll()
	12. registerNatives()
    
5. how many method are decalred final out of the 12 ?
Ans. 6 methods are declared final by java
	1. getclass()
	2. wait()
	3. wait()
	4. wait()
	5. notify()
	6. notifyAll()
since the methods are declared final means that the methods canot by overridden..
	

	
"********************************************************************************************************" 


getClass() Method


1. Can we override getClass() method ?
Ans. No, we cannot override the getClass() method.

2. why we cannot override the getClass() method?
Ans. Becausee it is declared Final by Java.




"********************************************************************************************************"


toString() method

1.  Which class has the toString() method?
Ans. Object Class

2. What is the working of toString() method ?
Ans.  Whenever we call an Object the toString() method is called.

3. what is the ReturbType of the toString() method?
Ans. String

4. Can we Override toString Method?
Ans. Yes we can..
 
5. Why do we need to override toString() method?
Ans. To get the meaningful output

6. What if we do not override the toString() method ?
Ans. The toString() method of Object Class is called by default and
	 displays the output as "ClassName@HexadecimalNumber". 


	 
	 
"*************************************************************************************************************"

hashCode() Method


1. 	What is HashCode ?	
Ans. For each object created ,JVM allocates a unique number with corresponding to each object.
     That unique number is known as hashcode. 

	 general example: "Classname@HexadecimalNumber" 
	 in the above line the "ClassName" is the name of the class whose Object has been called.
	 and the "HexadecimalNumber" is the HashCode (Reference) of that object.
  
2. Can we override hashCode()method ?
Ans. Yes we can override hashCode() method. 

3. What is the returnType of hashCode() method ?
Ans. int


"********************************************************************************************************"

equals() Method


1. Working of equals() method?
Ans. equals() method compares the reference of two objects.

2. can we overrude the equals() method ?
Ans. yes we can override th equals() method.

3. What is the return type of equals method ?
Ans. Boolean



"********************************************************************************************************"   