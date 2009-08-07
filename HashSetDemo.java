/* Studying HashSet */
import java.util.*;
public class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet <Object> hs = new HashSet();
		
		MyOwnClass ob1 = new MyOwnClass();
		MyOwnClass ob2 = new MyOwnClass("Switzerland",25);
		String name1 = "Santhosh";
		String name2 = "Unnikrishnan";
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		Integer num3 = new Integer(30);
		
		hs.add(ob1);
		hs.add(ob2);
		hs.add(name1);
		hs.add(name2);
		hs.add(num1);
		hs.add(num2);
		hs.add(num3);
		
		System.out.println("Contents of HashSet ");	
		System.out.println(hs);	
		
		
		Iterator <Object> itr = hs.iterator();
		System.out.println("Contents of HashSet using Iterator" );
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}