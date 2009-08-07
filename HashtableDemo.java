/* Studying Hashtable */
import java.util.*;
public class HashtableDemo
{
	public static void main(String args[])
	{
		Hashtable  hs = new Hashtable();
		String str;
		
		
		hs.put("First",new Double(35.77));
		hs.put("Second",new Integer(55));
		hs.put("Third","Hello");
		hs.put("Fourth","World");
		hs.put("Fifth","Great Wall");
		hs.put("Sixth","Of China");
		
		
		Enumeration contents = hs.keys();
		
		System.out.println("Contents of Hashtable ");	
		while(contents.hasMoreElements())
		{
			
			str = (String)contents.nextElement();
			System.out.println(hs.get(str));	
		}
		
		
		
		
	}
}