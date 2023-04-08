/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class DB {
    
    Connection con;
    
    public Connection Conexion(){
     try{
         con = DriverManager.getConnection("jdbc:mysql://localhost/parqueadero_udec","root","");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e.getMessage());
         
     }
     return con;
    }
    
    
}