package logins;
import java.lang.*;
import java.io.*;
import logins.CreateObject;
public class WriteObjectToFile
{
	private CreateObject obj;
	public WriteObjectToFile(CreateObject obj)
	{this.obj=obj;}
	
   public void writeObject(String filename) throws IOException
   {	 
   ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename));
   out.writeObject(obj);
   out.close();
   }
  
}