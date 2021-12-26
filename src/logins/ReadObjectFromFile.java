package logins;
import java.lang.*;
import java.io.*;
import logins.CreateObject;
public class ReadObjectFromFile
{
	private CreateObject obj;	
   public CreateObject readObject(String filename) throws IOException,ClassNotFoundException
   {	 
   ObjectInputStream out=new ObjectInputStream(new FileInputStream(filename));
   obj=(CreateObject)out.readObject();
   out.close();
   return obj;
   }
  
}