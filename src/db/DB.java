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

    public Connection Conexion() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/parqueadero_udec", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return con;
    }

    public ResultSet Consulta(String doc) {
        Connection conex = Conexion();
        ResultSet res = null;
        try {
            PreparedStatement pst = conex.prepareStatement("SELECT * FROM USUARIOS WHERE Documento =" + doc);
            res = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return res;
    }

    public void RegIngreso(String doc, String TVh, String placa, String notas) {
        Connection conex = Conexion();
        ResultSet res = Consulta(doc);

        try {
            if (res.next()) {
                PreparedStatement pst = conex.prepareStatement("INSERT INTO `registros` "
                        + "(`Consecutivo`, `Usuario`, `Rol`, `TipoV`, `Placa`,`Nota`, `FechaIngreso`, `FechaSalida`, `TiempoParqueo`) "
                        + "VALUES (NULL,'" + res.getString("Documento") + "','" + res.getString("Rol") + "','" + TVh + "','" 
                        + placa + "','"+notas+"', NOW(), NULL, NULL);");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
