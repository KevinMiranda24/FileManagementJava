/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package filemanagement.accesoadatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kevin
 */
public class ComunDBIT {
    
    public ComunDBIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obtenerConexion method, of class ComunDB.
     */
    @Test
    public void testObtenerConexion() throws Exception {
        System.out.println("ObtenerConexion");
        boolean expResult = false;
        Connection result = ComunDB.obtenerConexion();
        assertEquals(expResult, result.isClosed()); 
    }

    /**
     * Test of createStatement method, of class ComunDB.
     */
    @Test
    public void testCreateStatement() throws Exception {
        System.out.println("createStatement");
        Connection pConn = ComunDB.obtenerConexion();
        boolean expResult = false;
        Statement result = ComunDB.createStatement(pConn);
        assertEquals(expResult, result.isClosed());
    }

    /**
     * Test of createPreparedStatement method, of class ComunDB.
     */
    @Test
    public void testCreatePreparedStatement() throws Exception {
        System.out.println("createPreparedStatement");
        Connection pConn = ComunDB.obtenerConexion();
        String pSql = "";
        boolean expResult = false;
        PreparedStatement result = ComunDB.createPreparedStatement(pConn, pSql);
        assertEquals(expResult, result.isClosed());
    }

    /**
     * Test of obtenerResultSet method, of class ComunDB.
     */
    @Test
    public void testObtenerResultSet_Statement_String() throws Exception {
        System.out.println("ObtenerResultSet");
        Connection pConn = ComunDB.obtenerConexion();
        Statement pStatement = pConn.createStatement();
        String pSql = "SELECT TOP 5 * FROM ROL";
        boolean expResult = false;
        ResultSet result = ComunDB.obtenerResultSet(pStatement, pSql);
        assertEquals(expResult, result.isClosed());
    }

    /**
     * Test of obtenerResultSet method, of class ComunDB.
     */
    @Test
    public void testObtenerResultSet_PreparedStatement() throws Exception {
        System.out.println("ObtenerResultSet");
        Connection pConn = ComunDB.obtenerConexion();
        String pSql = "SELECT TOP 5 * FROM ROL";
        PreparedStatement pPreparedStatement = ComunDB.createPreparedStatement(pConn, pSql);
        boolean expResult = false;
        ResultSet result = ComunDB.obtenerResultSet(pPreparedStatement);
        assertEquals(expResult, result.isClosed());
    }

    /**
     * Test of ejecutarSQL method, of class ComunDB.
     */
    @Test
    public void testEjecutarSQL() throws Exception {
         System.out.println("EjecutarSQL");
        String pSql = "INSERT INTO Files(Nombre) VALUES('TEST COMUNDB') ";
        int expResult = 0;
        int result = ComunDB.ejecutarSQL(pSql);
        assertNotEquals(expResult, result);
        String pSql2 = "DELETE FROM Files WHERE Nombre='TEST COMUNDB'";
        int expResult2 = 0;
        int result2 = ComunDB.ejecutarSQL(pSql2);
        assertNotEquals(expResult2, result2);
    }
    
}
