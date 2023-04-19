/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package db;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class DBTest {
    
    public DBTest() {
    }

    @Test
    public void testConexion() {
        System.out.println("Conexion");
        DB instance = new DB();
        Connection expResult = null;
        Connection result = instance.Conexion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
