/* Tesing writng Objects to File */

import java.io.*;
public class FileOne
{
	
	public static void  main(String args[])throws IOException
	{
		try
		{
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("NewFile.txt"));
			FileOneDemo obj[] = new FileOneDemo[5];
			FileOneDemo obj1[] = new FileOneDemo[5];
			String name1[] = {"India","Australia","USA","UK","Kenya"};
		
			for(int i = 0; i < name1.length ; i++)
			{
				obj[i] = new FileOneDemo();
				obj[i].setName(name1[i]);
				output.writeObject(obj[i]);
			}
		
			
			output.flush();
			output.close();
			
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("NewFile.txt"));
			for(int i = 0; i < name1.length ; i++)
			{
				obj1[i] = new FileOneDemo();
				obj1[i] = (FileOneDemo) input.readObject();
			}
							
			System.out.flush();
			input.close();
			
			for(FileOneDemo object : obj1)
					System.out.println("String is :" +object);
		}
		
		catch(FileNotFoundException filenotfound)
		{
			System.out.println("File Not Found");
		}
		
		catch(NullPointerException nuupointerexception)
		{
			
		}
		
		catch(Exception exception)
		{
			System.out.println("Exception Caught: "+exception);
		}
		
		
		
	}	
	
}	

		
class FileOneDemo implements Serializable
{
	String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
}