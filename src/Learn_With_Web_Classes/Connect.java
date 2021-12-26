
package Learn_With_Web_Classes;
import logins.*;
import java.sql.*;
import java.io.*;
public class Connect {
    Connection c;
  //  Unp u2=new Unp();
    CreateObject obj;
    public void getData()
    {
    try { 
         obj=new ReadObjectFromFile().readObject("secure.dat");         
        } 
    catch (FileNotFoundException ex) 
           {
           try {           
            obj=new CreateObject("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:XE","system","09Gf3348#");
            WriteObjectToFile wrObj=new WriteObjectToFile(obj);
            wrObj.writeObject("secure_data.dat");           
              } 
           catch (IOException ex1) 
              {
                 DialogBox.okDialogError("Login Crediential File can't Access");
              }
            } 
    catch (IOException ex) 
        {
            DialogBox.okDialogError("Login Crediential File can't Access for read");            
        } 
    catch (ClassNotFoundException ex) 
        {
            DialogBox.okDialogError("DataBase Class Library Not Found");          
        }
    }
    public Connect()
    {      
       getData();
    }
        
    public Connection connectTo()
    {
        try{
        Class.forName(obj.getDataBaseClass());
        
        c=DriverManager.getConnection(obj.getUrl(),obj.getUserName(),obj.getPassword());
        return c;
        }catch(ClassNotFoundException ex){
            DialogBox.okDialogError("DataBase Class Library Missing");}
        catch(SQLException ex){DialogBox.okDialogError("Server Connection Error,Set Server");}
        return c;
    }
}
