package com.cc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 
{
 // Argumente für Connection-Parameter
        static String conURL = "jdbc:mysql://139.177.179.57:3306/mydb";
        static String usrStr = "remote_user";
        static String usrPwd = "Pass@remote#1";
        
        static Connection con;
         static Statement stmt;
        static ResultSet rs;
    
    
        public static void main(String[] args) {
            
          try {
            
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
    
            try (Connection con = DriverManager.getConnection(conURL, usrStr, usrPwd)) {
    
                //System.out.println("Success!");  
               System.out.println(con);
 
                
            } catch (Exception e) {
                e.printStackTrace();
            }
    
          } catch (Exception e) {
            e.printStackTrace();
          }
    
    
 }
        
    }