package code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mubashar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.*;  

class DatabaseConnectivity{  
    
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  

    try (
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/chatroom_db","root","")) {
        
      

    }
}catch(Exception e){ 
    System.out.println(e);}  


}  
} 