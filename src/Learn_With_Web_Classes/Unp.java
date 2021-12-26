package Learn_With_Web_Classes;
import java.io.Serializable;
public class Unp implements Serializable{
   private String cls,url,user_name,password;
   public void setdata(String cls,String url,String user_name,String password)
    {
    this.cls=cls;
    this.url=url;
    this.user_name=user_name;
    this.password=password;  
    }
   public String geturl(){return url;}
   public String getuser_name(){return user_name;}
   public String getpassword(){return password;}
   public String getclass(){return cls;}
}
