/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasequery;

import Learn_With_Web_Classes.Connect;
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul
 */
public class CreateDataBaseTables {
     Connect c=new Connect();
     Connection conn;
     Statement statement;
     ResultSet resultSet;
   
    public void createTable(String tableName,String tableColumn)  //create tables in database
    {
         try {
             conn=c.connectTo();
             statement=conn.createStatement();
             resultSet=new SqlQuery().sqlQuery(conn,statement,"create table "+tableName+"("+tableColumn+")");
         } catch (SQLException ex) {
             Logger.getLogger(CreateDataBaseTables.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         try {
              statement.close();
              resultSet.close();
              conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(CreateDataBaseTables.class.getName()).log(Level.SEVERE, null, ex);
         }
    }  //end of createTable function
    public void insertTableData(String tableName,String values)   //insert data into tables
    {
        try {
            
                conn=c.connectTo();
                statement=conn.createStatement();
                resultSet=new SqlQuery().sqlQuery(conn,statement,"insert into "+tableName+" values("+values+")");
            } catch (SQLException ex) {
                Logger.getLogger(CreateDataBaseTables.class.getName()).log(Level.SEVERE, null, ex);
            }
         try {
             statement.close();
             resultSet.close();
             conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(CreateDataBaseTables.class.getName()).log(Level.SEVERE, null, ex);
         }
    }   //end of insertTableData function
    public boolean isTableExist(String tableName)
    {        
         try {
            
                conn=c.connectTo();
                statement=conn.createStatement();
                resultSet=statement.executeQuery("select * from "+tableName);                
                statement.close();
                resultSet.close();
                conn.close();
         } catch (SQLException ex) 
         {
             try {
                  conn.close();
                  statement.close();
                  return false;                 
             } catch (SQLException ex1) {
                 Logger.getLogger(CreateDataBaseTables.class.getName()).log(Level.SEVERE, null, ex1);
             }               
                
           }
         return true;      
    }//end of isTableExist function
    
}  //end of main class
