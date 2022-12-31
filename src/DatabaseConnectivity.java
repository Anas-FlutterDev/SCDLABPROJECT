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
//here sonoo is database name, root is username and password
    try (
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/chatroom_db","root","")) {
        //here sonoo is database name, root is username and password
        int id=1;
        Statement stmt=con.createStatement();
//        stmt.executeUpdate("INSERT into patient VALUES ('2', 'ahmed','1234567')");
        ResultSet rs=stmt.executeQuery("select * from patient");
        
        while(rs.next()){
//            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } 
      PreparedStatement ps=con.prepareStatement("INSERT into patient VALUES (?,?,?)");
      ps.setString(1, "1");
      ps.setString(2, "Ali");
      ps.setString(3, "123445567");
      ps.executeUpdate();
    }
}catch(Exception e){ 
    System.out.println(e);}  


}  
} 