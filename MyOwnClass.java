/* MyOwnClass*/

class MyOwnClass
{
	String name;
	int age;
	MyOwnClass()
	{
		name = "India";
		age = 50;
	}
	MyOwnClass(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return String.format(" Name is %s and age is %d\t",name,age);
	}

}