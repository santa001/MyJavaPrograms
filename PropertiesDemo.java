/* Studying Properties */
import java.util.*;
import java.io.*;
public class PropertiesDemo
{
	public static void main(String args[])throws IOException
	{
		Properties  hs = new Properties();
		String str;
		
		
		hs.put("First",new Double(35.77));
		hs.put("Second",new Integer(55));
		hs.put("Third","Hello");
		hs.put("Fourth","World");
		hs.put("Fifth","Great Wall");
		hs.put("Sixth","Of China");
		
		
		Set states = hs.keySet();
		Iterator  itr = states.iterator();
		System.out.println("Contents of Properties ");	
		while(itr.hasNext())
		{
			
			str = (String)itr.next();
			System.out.println(hs.get(str));	
		}
		
		Properties  hs1 = new Properties();
		FileInputStream fin = null;
		fin = new FileInputStream("HashtableDemo.java");
		hs1.load(fin);
		Set states1 = hs1.keySet();
		Iterator  itr1 = states1.iterator();
		System.out.println("Contents of Properties ");	
		while(itr1.hasNext())
		{
			
			str = (String)itr1.next();
			System.out.println(hs1.get(str));	
		}
		
		
		
		
	}
}