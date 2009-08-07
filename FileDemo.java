import java.io.*;
public class FileDemo 
{
    public static void main(String args[])throws FileNotFoundException,IOException,NullPointerException
    {
        String string;
        FileInputStream fin = new FileInputStream("MyFile.txt");
        FileOutputStream fout = new FileOutputStream("MyCopyFile.txt");
		BufferedReader read = new BufferedReader (new InputStreamReader(fin));
		try
		{
			string =read.readLine();
			System.out.println("Content of file is ");
			while(!string.equals("null)"))
			{
				System.out.println(string);
				//fout.write(string);
				string =read.readLine();
				
			}
			
		}
		
		catch(NullPointerException e)
		{
		System.out.println("Operation Completed");
		}
		
        fin.close(); 
		File fin1 = new File("MyFile.txt");
		fin1.writeTo(fout);
		fout.close();
    }
}
