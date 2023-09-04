/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package filemanagement.accesoadatos;

import filemanagement.entidadessdeenegocioss.FileA;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class FileDALIT {
    
    public FileDALIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFields method, of class FileDAL.
     */
    @Test
    public void testGetFields() {
        System.out.println("getFields");
        String expResult = "";
        String result = FileDAL.getFields();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFile method, of class FileDAL.
     */
    @Test
    public void testAddFile() throws Exception {
        FileA file = new FileA();
        // Configurar los datos del archivo
        
        int result = FileDAL.addFile(file);
        assertTrue(result > 0);
    }

    /**
     * Test of deleteFile method, of class FileDAL.
     */
    @Test
    public void testDeleteFile() throws Exception {
        FileA file = new FileA();
        // Configurar los datos del archivo
        
        int result = FileDAL.deleteFile(file);
        assertTrue(result > 0);
    }

    /**
     * Test of assignDataResultSet method, of class FileDAL.
     */
    @Test
    public void testAssignDataResultSet() throws Exception {
        System.out.println("assignDataResultSet");
        FileA file = null;
        ResultSet resultSet = null;
        int index = 0;
        int expResult = 0;
        int result = FileDAL.assignDataResultSet(file, resultSet, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFiles method, of class FileDAL.
     */
    @Test
    public void testGetAllFiles() throws Exception {
         ArrayList<FileA> files = FileDAL.getAllFiles();
        assertNotNull(files);
        assertTrue(files.size() > 0);
    }

    /**
     * Test of querySelect method, of class FileDAL.
     */
    @Test
    public void testQuerySelect() throws Exception {
        System.out.println("querySelect");
        FileA file = null;
        ComunDB.UtilQuery pUtilQuery = null;
        FileDAL.querySelect(file, pUtilQuery);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileById method, of class FileDAL.
     */
    @Test
    public void testGetFileById() throws Exception {
        int fileId = 1; // ID de un archivo existente
        FileA file = FileDAL.getFileById(fileId);
        assertNotNull(file);
    }

    /**
     * Test of updateFile method, of class FileDAL.
     */
    @Test
    public void testUpdateFile() throws Exception {
        FileA file = new FileA();
        // Configurar los datos del archivo
        
        int result = FileDAL.updateFile(file);
        assertTrue(result > 0); 
    }
    
}
