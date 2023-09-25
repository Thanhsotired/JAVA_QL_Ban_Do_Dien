/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_qlbh.helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author chien
 */
public class Helper {
    private Connection getConnection() {
        var url = "jdbc:sqlserver://localhost;databaseName=JAVA_QLBH;user=sa;password=chienkoi123;encrypt=true;trustServerCertificate=true";
        
        try{
            Connection conn = DriverManager.getConnection(url);
            return conn;
            
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("KNTB - helper"); 
            return null;
        }
    }
    
    public ResultSet query(String Query) {
        Connection conn = getConnection();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            return rs;
        }catch(SQLException e) {
            return null;
        }
    } 
}
