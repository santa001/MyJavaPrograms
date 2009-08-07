/* Studying Vector */
import java.util.*;
public class VectorDemo
{
	public static void main(String args[])
	{
		Vector <Object> hs = new Vector(1,2);
		
		MyOwnClass ob1 = new MyOwnClass();
		MyOwnClass ob2 = new MyOwnClass("Switzerland",25);
		String name1 = "Santhosh";
		String name2 = "Unnikrishnan";
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		Integer num3 = new Integer(30);
		
		
		System.out.println("Capacity of Vector is "+hs.capacity());
		hs.addElement(ob1);
		System.out.println("Capacity of Vector is "+hs.capacity());
		System.out.println("Size of Vector is "+hs.size());
		hs.addElement(ob2);
		System.out.println("Capacity of Vector is "+hs.capacity());
		System.out.println("Size of Vector is "+hs.size());
		hs.addElement(name1);
		System.out.println("Capacity of Vector is "+hs.capacity());
		System.out.println("Size of Vector is "+hs.size());
		hs.addElement(name2);
		System.out.println("Capacity of Vector is "+hs.capacity());
		System.out.println("Size of Vector is "+hs.size());
		hs.addElement(num1);
		System.out.println("Size of Vector is "+hs.size());
		hs.addElement(num2);
		System.out.println("Size of Vector is "+hs.size());
		hs.addElement(num3);
		System.out.println("Size of Vector is "+hs.size());
		
		System.out.println("Contents of Vector ");	
		System.out.println(hs);	
		
		System.out.println("Content of array is ");
		Object []a = hs.toArray();
		
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
			
		System.out.println("\n");
		Iterator <Object> itr = hs.iterator();
		System.out.println("Contents of Vector using Iterator" );
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Contents of Vector after removal ");	
		System.out.println("First Contents of Vector after removal "+hs.firstElement());
		System.out.println("Last Contents of Vector after removal "+hs.lastElement());
		hs.removeElementAt(2);
		System.out.println(hs);	
	}
}