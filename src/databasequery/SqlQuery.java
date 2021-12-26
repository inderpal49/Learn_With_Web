package databasequery;
import Learn_With_Web_Classes.DialogBox;
import java.sql.*;


/**
 *
 * @author paul
 */
public class SqlQuery extends CreateDataBaseTables {
    
    public ResultSet sqlQuery(Connection conn,Statement statement,String query)
    {
        try 
        {
            statement=conn.createStatement();
            resultSet=statement.executeQuery(query);           
        } 
        catch (SQLException ex)
        {DialogBox.okDialogError("SQL QUERY ERROR");       }
        return resultSet;
    }
    
}
