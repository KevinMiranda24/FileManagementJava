/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package filemanagement.accesoadatos;



import filemanagement.entidadessdeenegocioss.FileA;
import java.sql.ResultSet;
import java.util.ArrayList;
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
public class FileDALIT {
    
    public FileDALIT() {
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
        System.out.println("addFile");
        FileA file = null;
        int expResult = 0;
        int result = FileDAL.addFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFile method, of class FileDAL.
     */
    @Test
    public void testDeleteFile() throws Exception {
        System.out.println("deleteFile");
        FileA file = null;
        int expResult = 0;
        int result = FileDAL.deleteFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getAllFiles");
        ArrayList<FileA> expResult = null;
        ArrayList<FileA> result = FileDAL.getAllFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getFileById");
        int fileId = 0;
        FileA expResult = null;
        FileA result = FileDAL.getFileById(fileId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFile method, of class FileDAL.
     */
    @Test
    public void testUpdateFile() throws Exception {
        System.out.println("updateFile");
        FileA file = null;
        int expResult = 0;
        int result = FileDAL.updateFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
