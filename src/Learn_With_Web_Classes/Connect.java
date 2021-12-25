
package Learn_With_Web_Classes;
import java.sql.*;
import java.io.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
public class Connect {
    Connection c;
    Unp u2=new Unp();
    public void getData()
    {
    try {           
         ObjectInputStream in=new ObjectInputStream(new FileInputStream("secure_data.dat"));
         u2=(Unp)in.readObject();
        } catch (FileNotFoundException ex) {
            DialogBox.okDialogError("Login Crediential File Missing,Set Server");          
        } catch (IOException ex) {
            DialogBox.okDialogError("Input_Output Error");            
        } catch (ClassNotFoundException ex) {
            DialogBox.okDialogError("Class File Not Found,Set Server");          
        }
    }
    public Connect()
    {      
       getData();
    }
        
    public Connection connectTo()
    {
        try{
        Class.forName(u2.getclass());
        c=DriverManager.getConnection(u2.geturl(),u2.getuser_name(),u2.getpassword());
        return c;
        }catch(ClassNotFoundException ex){
            DialogBox.okDialogError("Class Library Missing");}
        catch(SQLException ex){DialogBox.okDialogError("Server Connection Error,Set Server");}
        return c;
    }
}
