package logins;
import java.lang.*;
import java.io.*;
public class CreateObject implements Serializable  //serilizable interface serilise class object so that can be written to file
{
	String data_base_class,url,user_name,password;
	public CreateObject(String data_base_class,String url,String user_name,String password)
	{
                this.data_base_class=data_base_class;
		this.url=url;
		this.user_name=user_name;
		this.password=password;
	}
        public String getDataBaseClass(){return data_base_class;}
	public String getUrl(){return url;}
        public String getUserName(){return user_name;}
        public String getPassword(){return password;}  
}