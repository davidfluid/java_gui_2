package com.mycompany.sql_signin;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnection {
     public static Connection com(){
              Connection com = null;
     try{
     Class.forName("com.mysql.jdbc.Driver");
     com = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign_in","root","");
     JOptionPane.showMessageDialog(null,"Connected!");
     System.out.println("Connected!");
     }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
      }
     return com;
     }
}













