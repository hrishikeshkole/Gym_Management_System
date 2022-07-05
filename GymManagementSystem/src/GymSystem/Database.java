package GymSystem;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Mane
 */
public class Database {
    
    public Connection con;
    public Statement stmt;
    
    public Database(){
        try{
            Class.forName("org.postgresql.Driver");
            
            String url = "jdbc:postgresql://localhost:5432/gymmanagementsystem";
            String user = "g14";
            String pass = "g14123";
            
            con = DriverManager.getConnection(url, user, pass);
            
            stmt = con.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
